package info.scce.dime.auth;

import org.apache.shiro.authc.AuthenticationToken;

public class JWTShiroToken implements AuthenticationToken {

    private final long userId;
    private final String token;

    public JWTShiroToken(long userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    @Override
    public Long getPrincipal() {
        return userId;
    }

    @Override
    public String getCredentials() {
        return token;
    }
}
