package info.scce.dime.process;

import info.scce.dime.exception.GUIEncounteredSignal;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GUIResumer {

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GUIResumer.class);

    protected void checkAuthentication(ProcessCallFrame processCallFrame, String id) {
        LOGGER.debug("Checking for authentication");
        if (processCallFrame.isAuthenticationRequired()) {
            final Subject shiroSubj = SecurityUtils.getSubject();
            if (!shiroSubj.isAuthenticated()) {
                LOGGER.info("Received unauthenticated request");
                GUIEncounteredSignal sig = new GUIEncounteredSignal(processCallFrame, id);
                sig.setStatus(401);
                throw sig;
            }
        }
    }
}
