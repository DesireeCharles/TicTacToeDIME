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

@info.scce.dime.process.RequiresDI
public final class Startup_sA1GYNviEeWsF7MALrkAZQ implements DIMEProcess {


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
	_PXMhsNzNEeWtAOZsxPLKSA,
	_G8JPsNzHEeW2rv4DARGjjw,
	_iHeOANzGEeW2rv4DARGjjw,
	_PssUwNzGEeW2rv4DARGjjw,
	_sBOvANviEeWsF7MALrkAZQ,
	_5UqEcWtdEe2x_c6ogIlfZw,
	_t8v7kWteEe2x_c6ogIlfZw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ConcreteUserController ConcreteUserController;

	@Inject
	public Startup_sA1GYNviEeWsF7MALrkAZQ(final BeanManager beanManager, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ConcreteUserController ConcreteUserController) {
		this.beanManager = beanManager;
		this.ConcreteUserController = ConcreteUserController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public Startup_sA1GYNviEeWsF7MALrkAZQResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._PXMhsNzNEeWtAOZsxPLKSA);
	}
	
	

	@Override
	public Startup_sA1GYNviEeWsF7MALrkAZQResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private Startup_sA1GYNviEeWsF7MALrkAZQResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _PXMhsNzNEeWtAOZsxPLKSA: {
					curr = execute_PXMhsNzNEeWtAOZsxPLKSA(ctx);
					break;
				}
				case _G8JPsNzHEeW2rv4DARGjjw: {
					curr = execute_G8JPsNzHEeW2rv4DARGjjw(ctx);
					break;
				}
				case _iHeOANzGEeW2rv4DARGjjw: {
					curr = execute_iHeOANzGEeW2rv4DARGjjw(ctx);
					break;
				}
				case _PssUwNzGEeW2rv4DARGjjw: {
					curr = execute_PssUwNzGEeW2rv4DARGjjw(ctx);
					break;
				}
				case _sBOvANviEeWsF7MALrkAZQ: {
					return execute_sBOvANviEeWsF7MALrkAZQ(ctx);
				}
				case _5UqEcWtdEe2x_c6ogIlfZw: {
					curr = execute_5UqEcWtdEe2x_c6ogIlfZw(ctx);
					break;
				}
				case _t8v7kWteEe2x_c6ogIlfZw: {
					curr = execute_t8v7kWteEe2x_c6ogIlfZw(ctx);
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
	public static class Startup_sA1GYNviEeWsF7MALrkAZQResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public Startup_sA1GYNviEeWsF7MALrkAZQResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_sBOvANviEeWsF7MALrkAZQ";
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
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve all ConcreteUser'.
	public SIB_ID execute_PXMhsNzNEeWtAOZsxPLKSA(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ConcreteUserController domController = this.ConcreteUserController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser searchObject = domController.createSearchObject("");
		final List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser> result = domController.findByProperties(searchObject);
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._PssUwNzGEeW2rv4DARGjjw;
		}
		else {
			// branch 'success'
			return SIB_ID._5UqEcWtdEe2x_c6ogIlfZw;
		}
	}
	// container for graph abstraction 'CreateUser' and sub process 'CreateUser'.
	public SIB_ID execute_G8JPsNzHEeW2rv4DARGjjw(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw.CreateUser_cBxicNzDEeW2rv4DARGjjwResult result = instance.execute(false, "Mary Jane", "Watson", "pwd", "mary");
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._5UqEcWtdEe2x_c6ogIlfZw;
		}
			default: throw new IllegalStateException("SIB 'CreateUser' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateUser' and sub process 'CreateUser'.
	public SIB_ID execute_iHeOANzGEeW2rv4DARGjjw(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw.CreateUser_cBxicNzDEeW2rv4DARGjjwResult result = instance.execute(false, "J. Jonah", "Jameson ", "pwd", "jonah");
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._G8JPsNzHEeW2rv4DARGjjw;
		}
			default: throw new IllegalStateException("SIB 'CreateUser' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'CreateUser' and sub process 'CreateUser'.
	public SIB_ID execute_PssUwNzGEeW2rv4DARGjjw(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw.class);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.basic.CreateUser_cBxicNzDEeW2rv4DARGjjw.CreateUser_cBxicNzDEeW2rv4DARGjjwResult result = instance.execute(false, "Peter", "Parker", "pwd", "peter");
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._iHeOANzGEeW2rv4DARGjjw;
		}
			default: throw new IllegalStateException("SIB 'CreateUser' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph i/o 'success'.
	public Startup_sA1GYNviEeWsF7MALrkAZQResult execute_sBOvANviEeWsF7MALrkAZQ(final Context ctx) {
		return new Startup_sA1GYNviEeWsF7MALrkAZQResult(new SuccessReturnImpl(ctx));
	}
	// container for atomic SIB 'SayHello'.
	public SIB_ID execute_5UqEcWtdEe2x_c6ogIlfZw(final Context ctx) {
		try {
			info.scce.dime.app.demo.Native.sayHello("Dom");
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'SayHello' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._t8v7kWteEe2x_c6ogIlfZw;
	}
	// container for atomic SIB 'test'.
	public SIB_ID execute_t8v7kWteEe2x_c6ogIlfZw(final Context ctx) {
		try {
			info.scce.dime.app.demo.Native.test();
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'test' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._sBOvANviEeWsF7MALrkAZQ;
	}
	
}  
