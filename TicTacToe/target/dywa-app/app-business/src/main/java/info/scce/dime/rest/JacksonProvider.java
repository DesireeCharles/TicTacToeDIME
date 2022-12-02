package info.scce.dime.rest;

import com.codingrodent.jackson.crypto.CryptoModule;
import com.codingrodent.jackson.crypto.EncryptionService;
import com.codingrodent.jackson.crypto.PasswordCryptoContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import info.scce.dime.util.Constants;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;


/**
 * Created by frohme on 12.11.15.
 */
@Provider
public class JacksonProvider implements ContextResolver<ObjectMapper> {

    final ObjectMapper mapper;

    public JacksonProvider() {
        mapper = getPreconfiguredMapper();
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return mapper;
    }

    public static ObjectMapper getPreconfiguredMapper() {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        mapper.enable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);

        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        mapper.setFilterProvider(
                new SimpleFilterProvider().addFilter(
                        "DIME_Selective_Filter",
                        new DIMESelectiveRestFilter()
                )
        );

        final PolymorphicTypeValidator ptv =
                BasicPolymorphicTypeValidator.builder()
                        .allowIfBaseType("info.scce.dime.")
                        .allowIfBaseType("de.ls5.dywa.generated.rest.types.")
                        .build();
        mapper.setPolymorphicTypeValidator(ptv);

        final String encryptDisableProperty = System.getProperty(Constants.ENCRYPT_DISABLE_PROPERTY);
        if (!Boolean.parseBoolean(encryptDisableProperty)) {
            final String encryptPassphraseProperty = System.getProperty(Constants.ENCRYPT_PASSPHRASE_PROPERTY);
            if (encryptPassphraseProperty == null) {
                throw new IllegalStateException(
                        "Passphrase for encrypting HTTP payload is not set."
                                + " See system property " + Constants.ENCRYPT_PASSPHRASE_PROPERTY
                );
            }
            if (encryptPassphraseProperty.length() < 16) {
                throw new IllegalStateException(
                        "Passphrase for encrypting HTTP payload is shorter than 16 characters."
                                + " See system property " + Constants.ENCRYPT_PASSPHRASE_PROPERTY
                );
            }
            mapper.registerModule(
                    new CryptoModule().addEncryptionService(
                            new EncryptionService(
                                    mapper,
                                    new PasswordCryptoContext(encryptPassphraseProperty)
                            )
                    )
            );
        }

        return mapper;
    }

}
