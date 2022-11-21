package info.scce.dime.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

final class AppConfig extends AbstractAppConfig implements AppConfigInterface {

    private final ObjectMapper objectMapper;
    private final SystemPropertyInterface rawConfig;
    private Map<String, Object> parsedConfig;

    AppConfig(ObjectMapper objectMapper, SystemPropertyInterface config) {
        this.objectMapper = objectMapper;
        this.rawConfig = config;
    }

    @Override
    public Object get(String key) throws KeyNotFoundException, ConfigNotValidException {
        ensureConfigIsParsed();
        if (parsedConfig.containsKey(key)) {
            return parsedConfig.get(key);
        }
        throw new KeyNotFoundException(
                String.format("No value found for key \"%s\"", key)
        );
    }

    private void ensureConfigIsParsed() throws ConfigNotValidException {
        try {
            if (parsedConfig == null) {
                parsedConfig = parsedConfig();
            }
        } catch (IOException e) {
            throw new ConfigNotValidException(
                    String.format("The config is not valid: %s", rawConfig.value()),
                    e
            );
        }
    }

    private Map<String, Object> parsedConfig() throws IOException {
        return objectMapper.readValue(
                rawConfig.value(),
                new TypeReference<Map<String, Object>>() {
                }
        );
    }

}
