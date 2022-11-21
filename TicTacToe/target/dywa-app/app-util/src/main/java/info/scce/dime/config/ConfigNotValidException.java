package info.scce.dime.config;

public final class ConfigNotValidException extends AppConfigException {
    ConfigNotValidException(String message, Throwable cause) {
        super(message, cause);
    }
}
