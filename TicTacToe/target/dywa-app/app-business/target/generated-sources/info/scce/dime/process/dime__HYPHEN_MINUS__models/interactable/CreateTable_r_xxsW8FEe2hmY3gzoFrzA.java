package info.scce.dime.process.dime__HYPHEN_MINUS__models.interactable;

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

public final class CreateTable_r_xxsW8FEe2hmY3gzoFrzA implements DIMEProcess {


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
	_r_zm5W8FEe2hmY3gzoFrzA,
	_KEzEgW8GEe2hmY3gzoFrzA,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public CreateTable_r_xxsW8FEe2hmY3gzoFrzA(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public CreateTable_r_xxsW8FEe2hmY3gzoFrzAResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._KEzEgW8GEe2hmY3gzoFrzA);
	}
	
	
	public CreateTable_r_xxsW8FEe2hmY3gzoFrzAResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._KEzEgW8GEe2hmY3gzoFrzA);
	}

	@Override
	public CreateTable_r_xxsW8FEe2hmY3gzoFrzAResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_KEzEgW8GEe2hmY3gzoFrzA": return executeInternal(ctx, continue_KEzEgW8GEe2hmY3gzoFrzA(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private CreateTable_r_xxsW8FEe2hmY3gzoFrzAResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _r_zm5W8FEe2hmY3gzoFrzA: {
					return execute_r_zm5W8FEe2hmY3gzoFrzA(ctx);
				}
				case _KEzEgW8GEe2hmY3gzoFrzA: {
					curr = execute_KEzEgW8GEe2hmY3gzoFrzA(ctx);
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
	public static class CreateTable_r_xxsW8FEe2hmY3gzoFrzAResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public CreateTable_r_xxsW8FEe2hmY3gzoFrzAResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_r_zm5W8FEe2hmY3gzoFrzA";
			this.success = success;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public SuccessReturn getSuccessReturn() {
			return success;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>success</code>.
		 */
		public interface SuccessReturn {
		}
	
		/**
		 * Return type of branch <code>success</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class SuccessReturnImpl implements SuccessReturn {

			private final Context ctx;

	        SuccessReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// container for graph i/o 'success'.
	public CreateTable_r_xxsW8FEe2hmY3gzoFrzAResult execute_r_zm5W8FEe2hmY3gzoFrzA(final Context ctx) {
		return new CreateTable_r_xxsW8FEe2hmY3gzoFrzAResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB GameView _KEzEgW8GEe2hmY3gzoFrzA
	private static class InputsForGUISIB_KEzEgW8GEe2hmY3gzoFrzA {
		public de.ls5.dywa.generated.rest.types.Table
		 table;
	}
	
	
	// container for GUI SIB 'GameView'.
	public SIB_ID execute_KEzEgW8GEe2hmY3gzoFrzA(final Context ctx) {
	
		
		final InputsForGUISIB_KEzEgW8GEe2hmY3gzoFrzA inputs = new InputsForGUISIB_KEzEgW8GEe2hmY3gzoFrzA();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.dime__HYPHEN_MINUS__models.interactable.CreateTable_r_xxsW8FEe2hmY3gzoFrzA:_KEzEgW8GEe2hmY3gzoFrzA:_Dt340GtPEe25lcL0UO2uNA", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_KEzEgW8GEe2hmY3gzoFrzA", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_KEzEgW8GEe2hmY3gzoFrzA(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_KEzEgW8GEe2hmY3gzoFrzA");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.gameview.GameView_Dt340GtPEe25lcL0UO2uNAResult result = (info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.gameview.GameView_Dt340GtPEe25lcL0UO2uNAResult) guiResult;
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._r_zm5W8FEe2hmY3gzoFrzA;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_KEzEgW8GEe2hmY3gzoFrzA(ctx);
		}
	}
	
}  
