package info.scce.dime.common;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

public class CommonNativeUserServiceLibrary {

    public static boolean authenticateUser(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken();
        try {
            subject.login(token);
            return true;
        }
        catch (AuthenticationException e) {
            return false;
        }
    }

    public static boolean isUserAuthenticated() {
        return SecurityUtils.getSubject().isAuthenticated();
    }

    public static void logout() {
        SecurityUtils.getSubject().logout();
    }

    public static String createSaltedSHA512Hash(String param) {
        if (param == null || param.isEmpty()) {
            return "";
        }

        final ByteSource salt = new SecureRandomNumberGenerator().nextBytes();
        final Sha512Hash passwordHash = new Sha512Hash(param, salt, 1337);

        return passwordHash.toBase64() + ':' + salt.toBase64();
    }

}

