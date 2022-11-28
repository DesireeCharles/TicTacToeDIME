package info.scce.dime.auth;

import java.text.ParseException;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.HttpMethod;

import com.nimbusds.jose.JWSObject;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.apache.shiro.web.util.WebUtils;

public class JWTAuthenticationFilter extends AuthenticatingFilter {

    private final static String AUTHORIZATION = "Authorization";
    private final static String BEARER_PREFIX = "Bearer ";

    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {

        final HttpServletRequest httpRequest = WebUtils.toHttp(request);
        final String authzHeader = httpRequest.getHeader(AUTHORIZATION);

        if (authzHeader != null && authzHeader.startsWith(BEARER_PREFIX)) {
            return buildShiroToken(authzHeader.substring(BEARER_PREFIX.length()));
        }

        // return empty token, that will fail authentication
        return new UsernamePasswordToken();
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
    	
    	// allow unauthenticated OPTION requests
    	if (HttpMethod.OPTIONS.equalsIgnoreCase(WebUtils.toHttp(request).getMethod())) {
            return true;
        }
    	
        // try to login
        executeLogin(request, response);
        return true;
    }

    private JWTShiroToken buildShiroToken(String token) {
        try {
            final JWSObject jwsObject = JWSObject.parse(token);
            final Map<String, Object> payload = jwsObject.getPayload().toJSONObject();

            final long id = Long.parseLong(payload.get("sub").toString());

            return new JWTShiroToken(id, token);
        } catch (ParseException ex) {
            throw new AuthenticationException(ex);
        }

    }
}
