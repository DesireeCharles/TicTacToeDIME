package info.scce.dime.config.fake;

import info.scce.dime.config.SystemPropertyInterface;

public final class FakeSystemProperty implements SystemPropertyInterface {
    private final String value;

    public FakeSystemProperty(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
