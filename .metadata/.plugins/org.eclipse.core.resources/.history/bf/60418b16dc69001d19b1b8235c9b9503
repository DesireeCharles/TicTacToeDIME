package info.scce.dime.gui;

import info.scce.dime.process.*;
import info.scce.dime.rest.ObjectCache;
import info.scce.dime.util.CDIUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;

@RequestScoped
public class ProcessResumer {

    /**
     * Logger for this class
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessResumer.class);

    @Inject
    private BeanManager beanManager;

    @Inject
    private ObjectCache objectCache;

    public Object resumeFromGUI(ProcessCallFrame callStack, Object slgResult) {
        LOGGER.debug("Trying to resume process from gui");

        if (callStack.getCallFrames().isEmpty()) {
            LOGGER.debug("Callstack is empty. Nothing to do. Returning result {}", slgResult);
            return slgResult;
        }

        final int lastCallStackElementIdx = callStack.getCallFrames().size() - 1;
        final CallFrame currentFrame = callStack.getCallFrames().get(lastCallStackElementIdx);
        String sibPointer = currentFrame.getPointer();

        String[] sibPointerTuple = sibPointer.split(":");
        String slgFQN = sibPointerTuple[0];
        String sibId = sibPointerTuple[1];

        LOGGER.debug("Getting process with fqn: {} and id: {}", slgFQN, sibId);
        final DIMEProcess process = getProcessInstance(slgFQN);
        final JSONContext currentJSONCtx = currentFrame.getContext();

        // finish process
        final DIMEProcessResult<?> nextSlgResult = process.continueExecution(callStack, currentJSONCtx, sibId, slgResult);

        if (lastCallStackElementIdx == 0) {
            return nextSlgResult.toJSON(objectCache);
        }

        return resumeFromGUI(new ProcessCallFrame(callStack.getCallFrames().subList(0, lastCallStackElementIdx)),
                nextSlgResult);
    }

    private DIMEProcess getProcessInstance(String className) {

        try {
            @SuppressWarnings("unchecked") final Class<DIMEProcess> clazz = (Class<DIMEProcess>) Class.forName(className);

            if (clazz.getAnnotation(RequiresDI.class) != null) {
                return CDIUtil.getManagedInstance(beanManager, clazz);
            } else {
                return clazz.getConstructor(BeanManager.class).newInstance(beanManager);
            }
        } catch (ClassNotFoundException | InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException ex) {
            throw new IllegalArgumentException("Requested classes should always exists", ex);
        }
    }

}
