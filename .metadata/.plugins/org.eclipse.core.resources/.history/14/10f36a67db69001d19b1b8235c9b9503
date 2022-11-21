package info.scce.dime.config;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SystemPropertyTest {

    @Test
    public void test() {
        //given
        System.setProperty("info.scce.dime.app.config", "foo");
        SystemPropertyInterface appConfig = new SystemProperty("info.scce.dime.app.config");
        //when
        String value = appConfig.value();
        //then
        assertEquals("foo", value);
    }

}