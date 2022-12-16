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

public final class CheckDraw_9XpDwX1bEe2BL67A2MFPXw implements DIMEProcess {


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

		// context variables.
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table table;
		// direct dataflow variables.
		private java.lang.Long IntegerAddSuccessResult_EadmQX1cEe2BL67A2MFPXw;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState Get_GameStateTieLiteral_Liy64X1cEe2BL67A2MFPXw;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_9Xt8QX1bEe2BL67A2MFPXw,
	_EZsxQX1cEe2BL67A2MFPXw,
	_Fo8LkX1cEe2BL67A2MFPXw,
	_LipJ4X1cEe2BL67A2MFPXw,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public CheckDraw_9XpDwX1bEe2BL67A2MFPXw(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table table) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.table = table;
		
		return ctx;
	}

	public CheckDraw_9XpDwX1bEe2BL67A2MFPXwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table table) {
		final Context ctx = createContext(table);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._EZsxQX1cEe2BL67A2MFPXw);
	}
	
	

	@Override
	public CheckDraw_9XpDwX1bEe2BL67A2MFPXwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private CheckDraw_9XpDwX1bEe2BL67A2MFPXwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _9Xt8QX1bEe2BL67A2MFPXw: {
					return execute_9Xt8QX1bEe2BL67A2MFPXw(ctx);
				}
				case _EZsxQX1cEe2BL67A2MFPXw: {
					curr = execute_EZsxQX1cEe2BL67A2MFPXw(ctx);
					break;
				}
				case _Fo8LkX1cEe2BL67A2MFPXw: {
					curr = execute_Fo8LkX1cEe2BL67A2MFPXw(ctx);
					break;
				}
				case _LipJ4X1cEe2BL67A2MFPXw: {
					curr = execute_LipJ4X1cEe2BL67A2MFPXw(ctx);
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
	public static class CheckDraw_9XpDwX1bEe2BL67A2MFPXwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public CheckDraw_9XpDwX1bEe2BL67A2MFPXwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_9Xt8QX1bEe2BL67A2MFPXw";
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
			public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState getState();
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

			public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState getState() {
				return ctx.Get_GameStateTieLiteral_Liy64X1cEe2BL67A2MFPXw;
			}
		}
		


	// sibs
	// container for graph i/o 'success'.
	public CheckDraw_9XpDwX1bEe2BL67A2MFPXwResult execute_9Xt8QX1bEe2BL67A2MFPXw(final Context ctx) {
		return new CheckDraw_9XpDwX1bEe2BL67A2MFPXwResult(new SuccessReturnImpl(ctx));
	}
	// container for atomic SIB 'IntegerAdd'.
	public SIB_ID execute_EZsxQX1cEe2BL67A2MFPXw(final Context ctx) {
		try {
			final java.lang.Long result = info.scce.dime.common.CommonNativeIntegerServiceLibrary.add(Optional.ofNullable(ctx.table).map(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table::getmoveCounter).orElse(0l), 1l);
			ctx.IntegerAddSuccessResult_EadmQX1cEe2BL67A2MFPXw = result;
			Optional.ofNullable(ctx.table).get().setmoveCounter(result);
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'IntegerAdd' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._Fo8LkX1cEe2BL67A2MFPXw;
	}
	// container for atomic SIB 'IntegerGreaterOrEquals'.
	public SIB_ID execute_Fo8LkX1cEe2BL67A2MFPXw(final Context ctx) {
		if (info.scce.dime.common.CommonNativeIntegerServiceLibrary.greaterOrEquals(ctx.IntegerAddSuccessResult_EadmQX1cEe2BL67A2MFPXw, 9l)) {
			// branch 'true'
			return SIB_ID._LipJ4X1cEe2BL67A2MFPXw;
		}
		else {
			// branch 'false'
			return SIB_ID._9Xt8QX1bEe2BL67A2MFPXw;
		}
	}
	// container for retrieve enum literal SIB 'Get GameState'.
	public SIB_ID execute_LipJ4X1cEe2BL67A2MFPXw(final Context ctx) {
		ctx.Get_GameStateTieLiteral_Liy64X1cEe2BL67A2MFPXw = de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState.tie;
		// branch 'tie'
		return SIB_ID._9Xt8QX1bEe2BL67A2MFPXw;
	}
	
}  
