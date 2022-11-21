package info.scce.dime.auth;

import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RESTServiceAuthenticator extends BasicHttpAuthenticationFilter {

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RESTServiceAuthenticator.class);

    @Override
    protected boolean sendChallenge(ServletRequest request, ServletResponse response) {
        HttpServletResponse httpResponse = WebUtils.toHttp(response);
        HttpServletRequest httpRequest = WebUtils.toHttp(request);
        String httpMethod = httpRequest.getMethod();
        if ("OPTIONS".equalsIgnoreCase(httpMethod)) {
            LOGGER.debug("Received option request");
            return true;
        }
        LOGGER.info("Received unauthorized request");
        httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        /* set no {@link AUTHENTICATE_HEADER}-header, so the browser does nothing **/
        return false;
    }
}
