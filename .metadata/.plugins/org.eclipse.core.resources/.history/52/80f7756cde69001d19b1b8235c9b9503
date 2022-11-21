package info.scce.dime.auth;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * This class extends the FormAuthenticationFilter and alters its behaviour
 * on successful and failed logins. Instead of using redirects to inform the
 * client of the result of a login attempt, it uses status codes.
 * In case of a successful login it will respond with 200 OK.
 * In case of a failed login it will respond with 403 Forbidden.
 *
 * @see <a href="https://gitlab.com/scce/dime/-/issues/501">https://gitlab.com/scce/dime/-/issues/501</a>
 */
public class NoRedirectFormAuthenticationFilter extends FormAuthenticationFilter {

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(NoRedirectFormAuthenticationFilter.class);

    /**
     * Successful login.
     * Respond will be 200 OK.
     *
     * @return false
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) {
        LOGGER.info("Successful login");
        WebUtils.toHttp(response).setStatus(200);
        this.saveRequest(request);
        return false;
    }

    /**
     * Failed login.
     * Respond will be 403 Forbidden.
     *
     * @return false
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        LOGGER.info("Failed login attempt");
        WebUtils.toHttp(response).setStatus(403);
        this.setFailureAttribute(request, e);
        return false;
    }
}