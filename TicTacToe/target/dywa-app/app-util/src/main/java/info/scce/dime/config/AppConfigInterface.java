package info.scce.dime.config;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * AppConfigInterface.
 *
 * <p>Interface for accessing values (e.g. String) of dict-like app configurations.</p>
 */
public interface AppConfigInterface {
    /**
     * Creates an instance compatible with the AppConfigInterface.
     *
     * @return Instance compatible with the AppConfigInterface
     */
    static AppConfigInterface instance(ObjectMapper objectMapper) {
        return new AppConfig(
                objectMapper,
                new SystemProperty("info.scce.dime.app.config")
        );
    }

    /**
     * Returns the value for the given key.
     *
     * @param key under which the value is stored
     * @return Value as Object
     * @throws KeyNotFoundException    If the key couldn't be found
     * @throws ConfigNotValidException If the config isn't valid
     */
    Object get(String key) throws KeyNotFoundException, ConfigNotValidException;

    /**
     * Returns the value for the given key.
     *
     * @param key under which the value is stored
     * @return Value as String
     * @throws KeyNotFoundException    If the key couldn't be found
     * @throws ConfigNotValidException If the config isn't valid
     */
    String getString(String key) throws KeyNotFoundException, ConfigNotValidException;

}
