package info.scce.dime.auth;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * This class extends the default LogoutFilter to make use of
 * the referer header to redirect after a successful logout.
 * Thus the shiro.ini does not have to be manipulated.
 *
 * @see <a href="https://gitlab.com/scce/dime/-/issues/371">https://gitlab.com/scce/dime/-/issues/371</a>
 */
public class RefererRedirectLogoutFilter extends LogoutFilter {

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RefererRedirectLogoutFilter.class);

    /**
     * Will return either the value of the referer header
     * or falls back to the default implementation
     */
    protected String getRedirectUrl(ServletRequest request, ServletResponse response, Subject subject) {
        String referer = refererHeaderValue(request);
        LOGGER.debug("Getting redirect URL after logout: {}", referer);
        if (referer != null) {
            return referer;
        }
        // fallback to default implementation
        return super.getRedirectUrl(request, response, subject);
    }

    private String refererHeaderValue(ServletRequest request) {
        return WebUtils.toHttp(request).getHeader("Referer");
    }

}


