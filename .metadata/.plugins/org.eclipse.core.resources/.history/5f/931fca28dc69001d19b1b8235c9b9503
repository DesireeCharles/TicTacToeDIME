package info.scce.dime.config;

public final class SystemProperty implements SystemPropertyInterface {
    private final String key;

    public SystemProperty(String key) {
        this.key = key;
    }

    public String value() {
        return System.getProperty(key);
    }
}
