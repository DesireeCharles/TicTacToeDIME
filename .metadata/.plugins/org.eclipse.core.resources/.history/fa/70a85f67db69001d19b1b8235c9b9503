package info.scce.dime.common;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

import de.ls5.dywa.generated.util.DomainFileController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;


@Deprecated
public class CommonNativeServiceLibrary {

	/** the logger for this class */

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonNativeServiceLibrary.class);
	
	private static final String USER_DEFINED_CONTEXT_PREFIX = "USER_DEFINED_";
	
	public static boolean integerEquals(long a, long b) {
		return a == b;
	}
	
	public static boolean integerGreater(long a, long b) {
		return a > b;
	}
	
	public static long integerAdd(long a, long b) {
		return a + b;
	}
	
	public static double realAdd(double a, double b) {
		return a + b;
	}
	
	public static double realDiv(double a, double b) {
		return a / b;
	}
	
	public static double intToReal(long a) {
		return (double) a;
	}
	
	public static String intToString (long a){
		return Long.toString(a);
	}


	/**
	 * Log the given message on debug level
	 *
	 * @param message to log
	 */

	public static void logDebugMessage(String message) {
		LOGGER.debug(message);
	}

	/**
	 * Log the given message on error level
	 *
	 * @param message to log
	 */

	public static void logErrorMessage(String message) {
		LOGGER.error(message);
	}


	/**
	 * Log the given message on warn level
	 *
	 * @param message to log
	 */

	public static void logWarnMessage(String message) {
		LOGGER.warn(message);
	}


	/**
	 * Log the given message on info level
	 *
	 * @param message to log
	 */

	public static void logInfoMessage(String message) {
		LOGGER.info(message);
	}
	
	
	/**
	 * Put an object to the context. The {@code toString} 
	 * method will be used to log the object
	 * 
	 * @param name		the key where the object should be put
	 * @param obj		the object that should be put to the context
	 */
	
	public static void putToContext(String name, Object obj) {
		if (obj != null) 
		{
			LOGGER.debug("putting {} as {} to the logging context", obj, name);			
			MDC.put(USER_DEFINED_CONTEXT_PREFIX + name, obj.toString());
		} else {
			LOGGER.debug("the item for context name {} was null", name);	
		}
	}
	
	
	/**
	 * Clear the logging context
	 * 
	 * @param name the name to clear the context form
	 */
	
	public static void clearContext(String name) {
		LOGGER.debug("removing {}{} from the logging context", USER_DEFINED_CONTEXT_PREFIX, name);
		MDC.remove(USER_DEFINED_CONTEXT_PREFIX + name);
	}
	
	
	/**
	 * Put an object to the context. The {@code toString} 
	 * method will be used to log the object
	 * 
	 * @param name		the key where the object should be put
	 * @param obj 		the value that should be put to the context
	 */
	
	public static void putToContext(String name, String obj) {
		LOGGER.debug("putting {} as {} to the logging context", obj, name);			
		MDC.put(USER_DEFINED_CONTEXT_PREFIX + name, obj);
	}
	
	public static boolean textEquals(String a, String b) {
		return objectEquals(a, b);
	}
	
	public static String textAppend(String a, String b) {
		return a + " " + b;
	}
	
	public static String textToLowercase(String a) {
		return a.toLowerCase();
	}
	
	public static boolean textContains(String string, String needle) {
		return string.contains(needle);
	}
	
	public static String textJoin (String pre, String suff, String in){
		return pre + in + suff;
	}
	
	public static String shortenText (String a, long b){
		if (a.length() > 80){
			return a.substring(0, (int) b).trim();
		}
		else {
			return a.trim();
		}
	}
	
	public static boolean booleanSwitch(Boolean value) {
		if (value == null) return false;
		return value;
	}
	
	public static long textLength(String a) {
		return a.length();
	}
	
	public static boolean textIsNull(String a) {
		return (a == null);
	}
	
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

	public static boolean objectExists(Object object) {
		return object != null;
	}

	public static boolean objectEquals(Object a, Object b) {
		if (a == null) {
			if (b == null) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return a.equals(b);
		}
	}
	
	public static List<String> textSplit(String t, String splitter) {
		   return Arrays.asList(t.split(splitter));
	}

	public static de.ls5.dywa.generated.util.FileReference uploadProjectResource(final String path) {
		final BeanManager bm = CDI.current().getBeanManager();
		
		final Bean<DomainFileController> bean = (Bean<DomainFileController>) bm.resolve(bm.getBeans(DomainFileController.class));
		final CreationalContext<DomainFileController> cctx = bm.createCreationalContext(bean);
		final DomainFileController fileController = (DomainFileController) bm.getReference(bean, bean.getBeanClass(), cctx);
		
		final InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
		final String[] pathParts = path.split(File.separator);
		final String fileName = pathParts[pathParts.length - 1];
		
		return fileController.storeFile(fileName, inputStream);
	}
	
	 public static String convertToText(Object o) {
		 if (o == null) {
			return "null";
		 }
		 	return o.toString();
		 }
	
	public static void sleepForSomeTime(Long millis) {
	   try {
	      Thread.currentThread().sleep(millis);
	   }
	   catch (InterruptedException e) {
	      throw new RuntimeException(e);
	   }
	}

	public static String createSaltedSHA512Hash(String param) {
		if (param == null || param.isEmpty()) {
			return "";
		}

		final ByteSource salt = new SecureRandomNumberGenerator().nextBytes();
		final Sha512Hash passwordHash = new Sha512Hash(param, salt, 1337);

		return passwordHash.toBase64() + ':' + salt.toBase64();
	}
	
	public static String randomUUID() {
		return java.util.UUID.randomUUID().toString();
	}
}
