package info.scce.dime.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;


public class CommonNativeDebugService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonNativeDebugService.class);
    
    private static final String USER_DEFINED_LOGGING_CONTEXT_PREFIX = "USER_DEFINED_";
    

    public static void logErrorMessage(String message) {
        LOGGER.error(message);
    }

    public static void logWarnMessage(String message) {
        LOGGER.warn(message);
    }

    public static void logInfoMessage(String message) {
        LOGGER.info(message);
    }
    
    public static void logDebugMessage(String message) {
        LOGGER.debug(message);
    }
    
    /**
     * Put a string to the Mapped Diagnostic Context.
     * 
     * @param name      The key where the object should be put.
     * @param val       The value that should be put to the context.
     */
    public static void putToContext(String name, String val) {
        LOGGER.debug("putting {} as {} to the logging context", val, name);
        MDC.put(USER_DEFINED_LOGGING_CONTEXT_PREFIX + name, val);
    }
    
    /**
     * Put an object to the Mapped Diagnostic Context.
     * The {@code toString} method will be used to log the object
     * 
     * @param name      The key where the object should be put.
     * @param val       The object that should be put to the context.
     */
    public static void putToContext(String name, Object val) {
        if (val != null)
        {
            LOGGER.debug("putting {} as {} to the logging context", val, name);
            MDC.put(USER_DEFINED_LOGGING_CONTEXT_PREFIX + name, val.toString());
        } else {
            LOGGER.debug("the item for context name {} was null", name);    
        }
    }
    
    /**
     * Clear the Mapped Diagnostic Context.
     * 
     * @param name The name to clear the context form.
     */
    public static void clearContext(String name) {
        LOGGER.debug("removing {}{} from the logging context", USER_DEFINED_LOGGING_CONTEXT_PREFIX, name);
        MDC.remove(USER_DEFINED_LOGGING_CONTEXT_PREFIX + name);
    }
    
}
