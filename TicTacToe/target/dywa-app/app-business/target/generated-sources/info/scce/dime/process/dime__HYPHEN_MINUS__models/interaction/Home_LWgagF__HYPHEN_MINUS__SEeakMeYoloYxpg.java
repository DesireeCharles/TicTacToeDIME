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

@info.scce.dime.process.RequiresDI
public final class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Leaderboard Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw != null) {
						result.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw = de.ls5.dywa.generated.rest.types.Leaderboard.fromDywaEntity(ctx.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw, objectCache);
						de.ls5.dywa.generated.rest.types.LeaderboardSelective.copy(ctx.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw, result.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw != null) {
						result.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw = contextTransformer.transform(this.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw);
					}

					return result;
		        }
			}

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

		// direct dataflow variables.
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_e1c9EW8TEe29MJ2ZfnuTaA,
	_JVFm8XbqEe2qntwH9Ijd8A,
	_gzKeEX8FEe29IvxJUcVYFw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.LeaderboardController LeaderboardController;

	@Inject
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg(final BeanManager beanManager, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.LeaderboardController LeaderboardController) {
		this.beanManager = beanManager;
		this.LeaderboardController = LeaderboardController;
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

		return executeInternal(ctx, SIB_ID._JVFm8XbqEe2qntwH9Ijd8A);
	}
	
	
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._JVFm8XbqEe2qntwH9Ijd8A);
	}

	@Override
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_e1c9EW8TEe29MJ2ZfnuTaA": return executeInternal(ctx, continue_e1c9EW8TEe29MJ2ZfnuTaA(ctx, slgResult));
		case "_JVFm8XbqEe2qntwH9Ijd8A": return executeInternal(ctx, continue_JVFm8XbqEe2qntwH9Ijd8A(ctx, slgResult));
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
				case _JVFm8XbqEe2qntwH9Ijd8A: {
					curr = execute_JVFm8XbqEe2qntwH9Ijd8A(ctx);
					break;
				}
				case _gzKeEX8FEe29IvxJUcVYFw: {
					curr = execute_gzKeEX8FEe29IvxJUcVYFw(ctx);
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
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult result = instance.execute(ctx.callStack , ctx.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw);
	
		return continue_e1c9EW8TEe29MJ2ZfnuTaA(ctx, result);
	}
	
	public SIB_ID continue_e1c9EW8TEe29MJ2ZfnuTaA(Context ctx, Object slgResult) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult result = (info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "back": {
			// branch 'back'
			return SIB_ID._JVFm8XbqEe2qntwH9Ijd8A;
		}
			default: throw new IllegalStateException("SIB 'gamelOGIC' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB PublicHome _JVFm8XbqEe2qntwH9Ijd8A
	private static class InputsForGUISIB_JVFm8XbqEe2qntwH9Ijd8A {
	}
	
	
	// container for GUI SIB 'PublicHome'.
	public SIB_ID execute_JVFm8XbqEe2qntwH9Ijd8A(final Context ctx) {
	
		
		final InputsForGUISIB_JVFm8XbqEe2qntwH9Ijd8A inputs = new InputsForGUISIB_JVFm8XbqEe2qntwH9Ijd8A();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg:_JVFm8XbqEe2qntwH9Ijd8A:_LmrS0Ej8EeaK4_MRcoLfnw_INTERNAL", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_JVFm8XbqEe2qntwH9Ijd8A", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_JVFm8XbqEe2qntwH9Ijd8A(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_JVFm8XbqEe2qntwH9Ijd8A");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.publichome.PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALResult result = (info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.publichome.PublicHome_LmrS0Ej8EeaK4_MRcoLfnw_INTERNALResult) guiResult;
		if ("Play".equals(result.getBranchName())) {
			// branch 'Play'
			return SIB_ID._gzKeEX8FEe29IvxJUcVYFw;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_JVFm8XbqEe2qntwH9Ijd8A(ctx);
		}
	}
	// container for create SIB 'Create Leaderboard'.
	public SIB_ID execute_gzKeEX8FEe29IvxJUcVYFw(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.LeaderboardController domController = this.LeaderboardController;
	
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard createdObj = domController.create("");
	
	
		ctx.Create_LeaderboardSuccessCreated_gzrbc38FEe29IvxJUcVYFw = createdObj;
	
		// branch 'success'
		return SIB_ID._e1c9EW8TEe29MJ2ZfnuTaA;
	}
	
}  
