package info.scce.dime.auth;

import org.apache.shiro.authc.UsernamePasswordToken;

public class JWTLoginData extends UsernamePasswordToken {

    public JWTLoginData() {
        super();
    }

    public JWTLoginData(String username, String password) {
        super(username, password);
    }

    public JWTLoginData(String username, char[] password) {
        super(username, password);
    }
}
