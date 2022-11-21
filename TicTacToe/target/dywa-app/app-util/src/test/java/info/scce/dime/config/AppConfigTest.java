package info.scce.dime.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import info.scce.dime.config.fake.FakeSystemProperty;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AppConfigTest {

    @Test
    public void test() throws KeyNotFoundException, ConfigNotValidException {
        //given
        FakeSystemProperty appConfig = new FakeSystemProperty("{\"email\":\"test@example.org\"}");
        ObjectMapper objectMapper = new ObjectMapper();
        AppConfigInterface parsedAppConfig = new AppConfig(objectMapper, appConfig);
        //then
        assertEquals(
                "test@example.org",
                // when
                parsedAppConfig.getString("email")
        );
    }

    @Test
    public void testKeyNotFound() throws ConfigNotValidException {
        //given
        FakeSystemProperty appConfig = new FakeSystemProperty("{}");
        ObjectMapper objectMapper = new ObjectMapper();
        AppConfigInterface parsedAppConfig = new AppConfig(objectMapper, appConfig);
        try {
            //when
            parsedAppConfig.getString("nonExistingKey");
            fail(String.format("Expected %s to be thrown", KeyNotFoundException.class.getName()));
        } catch (KeyNotFoundException e) {
            //then
            assertEquals(
                    "No value found for key \"nonExistingKey\"",
                    e.getMessage()
            );
        }
    }

    @Test
    public void testConfigNotValid() throws KeyNotFoundException {
        //given
        FakeSystemProperty appConfig = new FakeSystemProperty("{");
        ObjectMapper objectMapper = new ObjectMapper();
        AppConfigInterface parsedAppConfig = new AppConfig(objectMapper, appConfig);
        try {
            //when
            parsedAppConfig.getString("nonExistingKey");
            fail(String.format("Expected %s to be thrown", ConfigNotValidException.class.getName()));
        } catch (ConfigNotValidException e) {
            // then
            assertEquals(
                    "The config is not valid: {",
                    e.getMessage()
            );
        }
    }

}