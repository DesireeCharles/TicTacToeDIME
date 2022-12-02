package info.scce.dime.process.dime__HYPHEN_MINUS__models.basic;

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
public final class CreateUser_cBxicNzDEeW2rv4DARGjjw implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser baseuser;
		// direct dataflow variables.
		private java.lang.String startLastName_qNqZYNzDEeW2rv4DARGjjw;
		private java.lang.String startUserName_mEu1INzDEeW2rv4DARGjjw;
		private java.lang.String HashPasswordSuccessHashedPassword_anME899QEeeA5bEoRBL2qw;
		private java.lang.String startFirstName_pEmfkNzDEeW2rv4DARGjjw;
		private java.lang.String startPassword_0H7qINzDEeW2rv4DARGjjw;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser Create_ConcreteUserSuccessCreated_djYfINzDEeW2rv4DARGjjw;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_dig8cNzDEeW2rv4DARGjjw,
	_cCXYUNzDEeW2rv4DARGjjw,
	_eKUjUNzDEeW2rv4DARGjjw,
	_anJBod9QEeeA5bEoRBL2qw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ConcreteUserController ConcreteUserController;
	private final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BaseUserController BaseUserController;

	@Inject
	public CreateUser_cBxicNzDEeW2rv4DARGjjw(final BeanManager beanManager, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ConcreteUserController ConcreteUserController, de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BaseUserController BaseUserController) {
		this.beanManager = beanManager;
		this.ConcreteUserController = ConcreteUserController;
		this.BaseUserController = BaseUserController;
	}

	private Context createContext(java.lang.String firstName, java.lang.String lastName, java.lang.String password, java.lang.String userName) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startFirstName_pEmfkNzDEeW2rv4DARGjjw = firstName;
		ctx.startLastName_qNqZYNzDEeW2rv4DARGjjw = lastName;
		ctx.startLastName_qNqZYNzDEeW2rv4DARGjjw = lastName;
		ctx.startPassword_0H7qINzDEeW2rv4DARGjjw = password;
		ctx.startUserName_mEu1INzDEeW2rv4DARGjjw = userName;
		ctx.startUserName_mEu1INzDEeW2rv4DARGjjw = userName;
		
		return ctx;
	}

	public CreateUser_cBxicNzDEeW2rv4DARGjjwResult execute(boolean isAuthenticationRequired,java.lang.String firstName, java.lang.String lastName, java.lang.String password, java.lang.String userName) {
		final Context ctx = createContext(firstName, lastName, password, userName);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._anJBod9QEeeA5bEoRBL2qw);
	}
	
	

	@Override
	public CreateUser_cBxicNzDEeW2rv4DARGjjwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private CreateUser_cBxicNzDEeW2rv4DARGjjwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _dig8cNzDEeW2rv4DARGjjw: {
					curr = execute_dig8cNzDEeW2rv4DARGjjw(ctx);
					break;
				}
				case _cCXYUNzDEeW2rv4DARGjjw: {
					return execute_cCXYUNzDEeW2rv4DARGjjw(ctx);
				}
				case _eKUjUNzDEeW2rv4DARGjjw: {
					curr = execute_eKUjUNzDEeW2rv4DARGjjw(ctx);
					break;
				}
				case _anJBod9QEeeA5bEoRBL2qw: {
					curr = execute_anJBod9QEeeA5bEoRBL2qw(ctx);
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
	public static class CreateUser_cBxicNzDEeW2rv4DARGjjwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public CreateUser_cBxicNzDEeW2rv4DARGjjwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_cCXYUNzDEeW2rv4DARGjjw";
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
			public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser getNewUser();
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

			public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser getNewUser() {
				return ctx.Create_ConcreteUserSuccessCreated_djYfINzDEeW2rv4DARGjjw;
			}
		}
		


	// sibs
	// container for create SIB 'Create ConcreteUser'.
	public SIB_ID execute_dig8cNzDEeW2rv4DARGjjw(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.ConcreteUserController domController = this.ConcreteUserController;
	
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser createdObj = domController.create(ctx.startLastName_qNqZYNzDEeW2rv4DARGjjw);
	
	
		ctx.Create_ConcreteUserSuccessCreated_djYfINzDEeW2rv4DARGjjw = createdObj;
		de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser value0 = createdObj;
		if (value0 != null) { // prevent null in lists
		Optional.ofNullable(ctx.baseuser).map(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser::getconcreteUser_ConcreteUser).get().add(value0);
		}
	
		// branch 'success'
		return SIB_ID._cCXYUNzDEeW2rv4DARGjjw;
	}
	// container for graph i/o 'success'.
	public CreateUser_cBxicNzDEeW2rv4DARGjjwResult execute_cCXYUNzDEeW2rv4DARGjjw(final Context ctx) {
		return new CreateUser_cBxicNzDEeW2rv4DARGjjwResult(new SuccessReturnImpl(ctx));
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_eKUjUNzDEeW2rv4DARGjjw(final Context ctx) {
		final de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser createdObj = domController.create(ctx.startUserName_mEu1INzDEeW2rv4DARGjjw);
	
		createdObj.setlastName(ctx.startLastName_qNqZYNzDEeW2rv4DARGjjw);
		createdObj.setpassword(ctx.HashPasswordSuccessHashedPassword_anME899QEeeA5bEoRBL2qw);
		createdObj.setfirstName(ctx.startFirstName_pEmfkNzDEeW2rv4DARGjjw);
		createdObj.setusername(ctx.startUserName_mEu1INzDEeW2rv4DARGjjw);
	
		ctx.baseuser = createdObj;
	
		// branch 'success'
		return SIB_ID._dig8cNzDEeW2rv4DARGjjw;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_anJBod9QEeeA5bEoRBL2qw(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeUserServiceLibrary.createSaltedSHA512Hash(ctx.startPassword_0H7qINzDEeW2rv4DARGjjw);
			ctx.HashPasswordSuccessHashedPassword_anME899QEeeA5bEoRBL2qw = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._eKUjUNzDEeW2rv4DARGjjw;
	}
	
}  
