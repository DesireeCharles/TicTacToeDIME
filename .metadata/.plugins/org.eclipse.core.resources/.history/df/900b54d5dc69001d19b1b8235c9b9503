package info.scce.dime.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppConfigInterfaceTest {

    @Test
    public void test() throws KeyNotFoundException, ConfigNotValidException {
        //given
        System.setProperty("info.scce.dime.app.config", "{\"email\":\"test@example.org\"}");
        AppConfigInterface parsedAppConfig = AppConfigInterface.instance(
                new ObjectMapper()
        );
        //when
        String email = parsedAppConfig.getString("email");
        //then
        assertEquals("test@example.org", email);
    }

}