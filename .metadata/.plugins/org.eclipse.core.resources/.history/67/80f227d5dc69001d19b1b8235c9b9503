package info.scce.dime.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(
        filterName = "ResponseInterceptorFilter",
        urlPatterns = "*"
)
public class ResponseInterceptorFilter
        implements Filter {

    /**
     * Logger for this class
     */

    private static final Logger LOGGER = LoggerFactory.getLogger(ResponseInterceptorFilter.class);


    /**
     * Init function the initializing the filter. Destroy life cycle hook.
     *
     * @param fConfig the filter config from the web.xml
     */

    public void init(FilterConfig fConfig) {
        // nothing to do here
    }

    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {
        // pass the request along the filter chain
        if (response instanceof HttpServletResponse) {
            HttpServletResponse res = (HttpServletResponse) response;
            // only log error responses (CODE: 5xx)
            if (res.getStatus() % 500 < 100) {
                LOGGER.error("Error Response Code: {}", res.getStatus());
            }

            // only log error responses (CODE: 4xx)
            if (res.getStatus() % 400 < 100) {
                LOGGER.warn("Error Response Code: {}", res.getStatus());
            }
        }
        chain.doFilter(request, response);
    }


    /**
     * Destroy life cycle hook. Does nothing for this filter
     */

    public void destroy() {
        // nothing to do here
    }

}
