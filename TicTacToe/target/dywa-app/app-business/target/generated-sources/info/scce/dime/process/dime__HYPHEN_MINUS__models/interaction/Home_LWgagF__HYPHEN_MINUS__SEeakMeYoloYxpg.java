package info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.UUID;
import java.util.Optional;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import info.scce.dime.exception.GUIEncounteredSignal;
import info.scce.dime.exception.GUIEncounteredSignal.GUIInfo;
import info.scce.dime.process.CallFrame;
import info.scce.dime.process.DIMEProcess;
import info.scce.dime.process.DIMEProcessContext;
import info.scce.dime.process.JSONContext;
import info.scce.dime.process.ProcessCallFrame;
import info.scce.dime.util.CDIUtil;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

public final class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg implements DIMEProcess {


	// attributes shaping the context variables.
	public static class Context implements DIMEProcessContext {

		// bean manager
		private BeanManager beanManager;
		
		// current eventID
		private String eventId;
		
		// last MajorSIBId
		private String lastMajorSIBId;
		
		// current MajorGUI
		private GUIInfo majorGUIState = null;

		// stack variables
		private ProcessCallFrame callStack = new ProcessCallFrame();


		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_e1c9EW8TEe29MJ2ZfnuTaA,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._e1c9EW8TEe29MJ2ZfnuTaA);
	}
	
	
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._e1c9EW8TEe29MJ2ZfnuTaA);
	}

	@Override
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_e1c9EW8TEe29MJ2ZfnuTaA": return executeInternal(ctx, continue_e1c9EW8TEe29MJ2ZfnuTaA(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _e1c9EW8TEe29MJ2ZfnuTaA: {
					curr = execute_e1c9EW8TEe29MJ2ZfnuTaA(ctx);
					break;
				}
				default: {
					throw new IllegalStateException("unhandled SIB container " + curr);
				}
			}
		}
	}
	
	/**
	 * The return type for this process. It stores the corresponding branch name 
	 * as well as the corresponding result for the branch.
	 */
	public static class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		

	}
	
	// model branches.


	// sibs
	// container for graph abstraction 'gamelOGIC' and sub process 'gamelOGIC'.
	public SIB_ID execute_e1c9EW8TEe29MJ2ZfnuTaA(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA instance = new info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg:_e1c9EW8TEe29MJ2ZfnuTaA", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult result = instance.execute(ctx.callStack );
	
		return continue_e1c9EW8TEe29MJ2ZfnuTaA(ctx, result);
	}
	
	public SIB_ID continue_e1c9EW8TEe29MJ2ZfnuTaA(Context ctx, Object slgResult) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult result = (info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
			default: throw new IllegalStateException("SIB 'gamelOGIC' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
}  
