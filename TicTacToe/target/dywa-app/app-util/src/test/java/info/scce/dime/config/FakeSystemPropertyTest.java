package info.scce.dime.config;

import info.scce.dime.config.fake.FakeSystemProperty;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakeSystemPropertyTest {

    @Test
    public void test() {
        //given
        FakeSystemProperty appConfig = new FakeSystemProperty("value");
        //then
        assertEquals(
                "value",
                // when
                appConfig.value()
        );
    }
}