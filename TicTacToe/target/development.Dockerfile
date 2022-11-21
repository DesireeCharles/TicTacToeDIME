#################################
## WILDFLY CONFIGURATION STAGE ##
#################################
FROM quay.io/wildfly/wildfly:26.0.0.Final as wildfly-dime
# Switching to user root to avoid permission failures
USER root
# Set system wide locale
RUN yum -y update glibc-common
RUN localedef -i en_US -f UTF-8 en_US.UTF-8
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8
# Locations of dependencies
ENV POSTGRESDRIVER_JAR_FILE postgresql-42.2.2.jar
ENV POSTGRESDRIVER_JAR_URL https://jdbc.postgresql.org/download/$POSTGRESDRIVER_JAR_FILE
# Wildfly path configuration
ENV WILDFLY_HOME_PATH /opt/jboss/wildfly
ENV WILDFLY_BIN_PATH $WILDFLY_HOME_PATH/bin
ENV WILDFLY_CONFIGURATION_PATH $WILDFLY_HOME_PATH/standalone/configuration
ENV WILDFLY_DATA_PATH $WILDFLY_HOME_PATH/standalone/data
ENV WILDFLY_FILES_PATH $WILDFLY_DATA_PATH/files
ENV WILDFLY_POSTGRES_MODULE_PATH $WILDFLY_HOME_PATH/modules/system/layers/base/org/postgresql/main/
# Configure Wildfly
COPY --chown=jboss:jboss docker/standalone.xml $WILDFLY_CONFIGURATION_PATH/
COPY --chown=jboss:jboss docker/standalone.conf $WILDFLY_BIN_PATH/
# Installation of PostgreSQL-driver
RUN mkdir -p $WILDFLY_POSTGRES_MODULE_PATH && \
    curl --output $WILDFLY_POSTGRES_MODULE_PATH$POSTGRESDRIVER_JAR_FILE $POSTGRESDRIVER_JAR_URL && \
    chown -R jboss:jboss $WILDFLY_POSTGRES_MODULE_PATH$POSTGRESDRIVER_JAR_FILE
COPY --chown=jboss:jboss docker/module.xml $WILDFLY_POSTGRES_MODULE_PATH/module.xml
# Apply directory changes to enable volume binding
RUN mkdir -p $WILDFLY_FILES_PATH && chown -R jboss:jboss $WILDFLY_DATA_PATH

##########################
## FRONTEND BUILD STAGE ##
##########################
FROM google/dart:2.10.5 AS dart
RUN pub global activate webdev 2.6.2
WORKDIR /app
COPY webapp/pubspec.* /app/
RUN pub get
COPY webapp /app
RUN /root/.pub-cache/bin/webdev build

#########################
## BACKEND BUILD STAGE ##
#########################
FROM maven:3.8.1-jdk-8 as maven
WORKDIR /app/dywa-app
# Create the module structure and copy
# containing pom.xml files seperated from
# the source code to utilize caching mechanism of Docker.
COPY dywa-app/app-addon app-addon
COPY dywa-app/app-business/pom.xml app-business/
COPY dywa-app/app-ear/pom.xml app-ear/
COPY dywa-app/app-persistence-api/pom.xml app-persistence-api/
COPY dywa-app/app-persistence-impl/pom.xml app-persistence-impl/
COPY dywa-app/app-presentation/pom.xml app-presentation/
COPY dywa-app/app-util/pom.xml app-util/
COPY dywa-app/pom.xml .
COPY dywa-app/xadisk/pom.xml xadisk/
# This plugin resolves and downloads all known depenendies.
# If this step is correctly configured, it should be cached by Docker
# after the first successfull run.
RUN mvn org.apache.maven.plugins:maven-dependency-plugin:3.2.0:go-offline
COPY dywa-app .
# If the caching mechanism of Docker is correctly used,
# the following step just builds the software without
# resolving further depenencies.
WORKDIR /app/dywa-app
# Copy compiled fontend files where the pom.xml expects to find them
COPY --from=dart /app/build /app/dywa-app/app-presentation/target/pub-build/web
RUN mvn -P!frontend install

########################
## WILDFLY COPY STAGE ##
########################
FROM wildfly-dime
ENV WILDFLY_DEPLOYMENTS_PATH $WILDFLY_HOME_PATH/standalone/deployments
COPY --from=maven --chown=jboss:jboss /app/dywa-app/app-ear/target/app-1.0-SNAPSHOT.ear $WILDFLY_DEPLOYMENTS_PATH/
# Switching to user jboss
USER jboss
