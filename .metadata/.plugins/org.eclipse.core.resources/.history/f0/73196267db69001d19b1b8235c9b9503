package info.scce.dime.rest;

import info.scce.dime.logging.LoggingContextFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


/**
 * class for mapping exceptions to the response and logging the error appropriately
 */
@Provider
public class RESTExceptionMapper implements ExceptionMapper<Exception> {

    /**
     * the logger for this class
     */

    private static final Logger LOGGER = LoggerFactory.getLogger(RESTExceptionMapper.class);


    /**
     * Create an better response for the error that occurred with the corresponding transaction ID
     *
     * @param exception the exception that occurred
     * @return the response send
     */
    @Override
    public Response toResponse(Exception exception) {
        final String uuid = MDC.get(LoggingContextFilter.TXN_ID_KEY);
        LOGGER.error(uuid);
        LOGGER.error("Endpoint encountered an error:", exception);
        return Response.serverError().entity(uuid).build();
    }
}
