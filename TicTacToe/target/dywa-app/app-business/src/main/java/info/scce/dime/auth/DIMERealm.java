package info.scce.dime.auth;

import java.text.ParseException;
import java.util.Date;

import com.nimbusds.jose.JWSObject;
import com.nimbusds.jwt.JWTClaimsSet;
import info.scce.dime.util.CDIUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.realm.AuthenticatingRealm;

public class DIMERealm extends AuthenticatingRealm {

    public final static String REALM = "DIMERealm";

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTShiroToken;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        final JWTShiroToken jwToken = (JWTShiroToken) token;

        try {
            final JWSObject object = JWTUtil.parseToken(jwToken.getCredentials());

            if (!JWTUtil.validateToken(object)) {
                throw new AuthenticationException("Token cannot be validated");
            }

            JWTClaimsSet claims = JWTUtil.parseClaims(object);

            if (new Date().after(claims.getExpirationTime())) {
                throw new AuthenticationException("Token expired");
            }

            final long authId = Long.parseLong(claims.getSubject());

            return new SimpleAccount(authId, jwToken.getCredentials(), REALM);

        } catch (ParseException e) {
            throw new AuthenticationException("Unable to process token", e);
        }
    }
}
