package info.scce.dime.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

/**
 * Filter for logging the request that was received and adding request specific context to the log
 *
 * @author danielstefank
 */

@WebFilter(
        filterName = "LoggingContextFilter",
        urlPatterns = "*"
)
public class LoggingContextFilter implements Filter {

    /**
     * Logger for this class
     */

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingContextFilter.class);


    /**
     * the transaction ID key
     */

    public static String TXN_ID_KEY = "TXN_ID";


    /**
     * Init function the initializing the filter. Nothing to do here for this filter
     *
     * @param fConfig the filter config from the web.xml
     */

    public void init(FilterConfig fConfig) {
        // nothing to do
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // set a unique transaction id to the Logging context
        String transactionId = UUID.randomUUID().toString();
        // get start time
        Instant start = Instant.now();

        MDC.put(TXN_ID_KEY, transactionId);

        // add request specific data to logging context
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            MDC.put("REQUESTED_URI", httpRequest.getRequestURI());
            MDC.put("REQUESTED_METHOD", httpRequest.getMethod());
            LOGGER.info("Request received. Method={} URI={}", httpRequest.getMethod(), httpRequest.getRequestURI());
        }

        try {
            // handle the request
            chain.doFilter(request, response);
            Instant finish = Instant.now();
            long timeElapsed = Duration.between(start, finish).toMillis();
            LOGGER.info("Response finished. Duration={}ms", timeElapsed);
        } finally {
            // cleanup
            MDC.clear();
        }
    }


    /**
     * Destroy life cycle hook. Does nothing for this filter
     */

    public void destroy() {
        // nothing to do
    }

}
