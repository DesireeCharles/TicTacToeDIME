package info.scce.dime.config;

public abstract class AppConfigException extends Throwable {
    AppConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    AppConfigException(String message) {
        super(message);
    }
}
