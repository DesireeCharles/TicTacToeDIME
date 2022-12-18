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

public final class ShowButtonPress_LhjwAXTxEe29EM7zgtpvCg implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry tableentry;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard leaderboard;
		// direct dataflow variables.
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState Get_EntryStateXLiteral_YatzwXTxEe29EM7zgtpvCg;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState Get_EntryStateOLiteral_ZGZ1E3TxEe29EM7zgtpvCg;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState Get_TurnStateOLiteral_c9n__HYPHEN_MINUS__QXTxEe29EM7zgtpvCg;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState Get_TurnStateXLiteral_dn31IXTxEe29EM7zgtpvCg;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_LhthA3TxEe29EM7zgtpvCg,
	_Rakx0XTxEe29EM7zgtpvCg,
	_YaWnYXTxEe29EM7zgtpvCg,
	_ZGGTEXTxEe29EM7zgtpvCg,
	_c9HA4XTxEe29EM7zgtpvCg,
	_dnZ7EXTxEe29EM7zgtpvCg,
	_jSVEQXT2Ee29EM7zgtpvCg,
	_7qmPuXT2Ee29EM7zgtpvCg,
	_mNc8IXT3Ee29EM7zgtpvCg,
	_mmIh4XT3Ee29EM7zgtpvCg,
	_YqfJ4X1cEe2BL67A2MFPXw,
	_KS8tEX3fEe2ONMPeQEJUSA,
	_PyrFIX3fEe2ONMPeQEJUSA,
	_eaqXUX3hEe2ONMPeQEJUSA,
	_e8FCUX3hEe2ONMPeQEJUSA,
	_vASWsX3qEe2ONMPeQEJUSA,
	_L1DQoX3tEe2ONMPeQEJUSA,
	_N7GXIX3tEe2ONMPeQEJUSA,
	_hxEisX8DEe29IvxJUcVYFw,
	_5U71oX8DEe29IvxJUcVYFw,
	_6OkMUX8DEe29IvxJUcVYFw,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public ShowButtonPress_LhjwAXTxEe29EM7zgtpvCg(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry entry, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard leaderboard, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table table) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.tableentry = entry;
		ctx.leaderboard = leaderboard;
		ctx.table = table;
		
		return ctx;
	}

	public ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry entry, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard leaderboard, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table table) {
		final Context ctx = createContext(entry, leaderboard, table);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._Rakx0XTxEe29EM7zgtpvCg);
	}
	
	

	@Override
	public ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _LhthA3TxEe29EM7zgtpvCg: {
					return execute_LhthA3TxEe29EM7zgtpvCg(ctx);
				}
				case _Rakx0XTxEe29EM7zgtpvCg: {
					curr = execute_Rakx0XTxEe29EM7zgtpvCg(ctx);
					break;
				}
				case _YaWnYXTxEe29EM7zgtpvCg: {
					curr = execute_YaWnYXTxEe29EM7zgtpvCg(ctx);
					break;
				}
				case _ZGGTEXTxEe29EM7zgtpvCg: {
					curr = execute_ZGGTEXTxEe29EM7zgtpvCg(ctx);
					break;
				}
				case _c9HA4XTxEe29EM7zgtpvCg: {
					curr = execute_c9HA4XTxEe29EM7zgtpvCg(ctx);
					break;
				}
				case _dnZ7EXTxEe29EM7zgtpvCg: {
					curr = execute_dnZ7EXTxEe29EM7zgtpvCg(ctx);
					break;
				}
				case _jSVEQXT2Ee29EM7zgtpvCg: {
					curr = execute_jSVEQXT2Ee29EM7zgtpvCg(ctx);
					break;
				}
				case _7qmPuXT2Ee29EM7zgtpvCg: {
					curr = execute_7qmPuXT2Ee29EM7zgtpvCg(ctx);
					break;
				}
				case _mNc8IXT3Ee29EM7zgtpvCg: {
					curr = execute_mNc8IXT3Ee29EM7zgtpvCg(ctx);
					break;
				}
				case _mmIh4XT3Ee29EM7zgtpvCg: {
					curr = execute_mmIh4XT3Ee29EM7zgtpvCg(ctx);
					break;
				}
				case _YqfJ4X1cEe2BL67A2MFPXw: {
					curr = execute_YqfJ4X1cEe2BL67A2MFPXw(ctx);
					break;
				}
				case _KS8tEX3fEe2ONMPeQEJUSA: {
					curr = execute_KS8tEX3fEe2ONMPeQEJUSA(ctx);
					break;
				}
				case _PyrFIX3fEe2ONMPeQEJUSA: {
					curr = execute_PyrFIX3fEe2ONMPeQEJUSA(ctx);
					break;
				}
				case _eaqXUX3hEe2ONMPeQEJUSA: {
					curr = execute_eaqXUX3hEe2ONMPeQEJUSA(ctx);
					break;
				}
				case _e8FCUX3hEe2ONMPeQEJUSA: {
					curr = execute_e8FCUX3hEe2ONMPeQEJUSA(ctx);
					break;
				}
				case _vASWsX3qEe2ONMPeQEJUSA: {
					curr = execute_vASWsX3qEe2ONMPeQEJUSA(ctx);
					break;
				}
				case _L1DQoX3tEe2ONMPeQEJUSA: {
					curr = execute_L1DQoX3tEe2ONMPeQEJUSA(ctx);
					break;
				}
				case _N7GXIX3tEe2ONMPeQEJUSA: {
					curr = execute_N7GXIX3tEe2ONMPeQEJUSA(ctx);
					break;
				}
				case _hxEisX8DEe29IvxJUcVYFw: {
					curr = execute_hxEisX8DEe29IvxJUcVYFw(ctx);
					break;
				}
				case _5U71oX8DEe29IvxJUcVYFw: {
					curr = execute_5U71oX8DEe29IvxJUcVYFw(ctx);
					break;
				}
				case _6OkMUX8DEe29IvxJUcVYFw: {
					curr = execute_6OkMUX8DEe29IvxJUcVYFw(ctx);
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
	public static class ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_LhthA3TxEe29EM7zgtpvCg";
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
	public ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult execute_LhthA3TxEe29EM7zgtpvCg(final Context ctx) {
		return new ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult(new SuccessReturnImpl(ctx));
	}
	// container for switch enum SIB 'Switch TurnState'.
	public SIB_ID execute_Rakx0XTxEe29EM7zgtpvCg(final Context ctx) {
		if(Optional.ofNullable(ctx.table).map(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table::getturnState).orElse(null) == null) {
			// branch 'else'
			return SIB_ID._LhthA3TxEe29EM7zgtpvCg;
		}
	
		switch(Optional.ofNullable(ctx.table).map(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table::getturnState).orElse(null).toString()){
			case "X": // branch 'X'
			return SIB_ID._YaWnYXTxEe29EM7zgtpvCg;
			case "O": // branch 'O'
			return SIB_ID._ZGGTEXTxEe29EM7zgtpvCg;
			default : // branch 'else'
			return SIB_ID._LhthA3TxEe29EM7zgtpvCg;
		}
	}
	// container for retrieve enum literal SIB 'Get EntryState'.
	public SIB_ID execute_YaWnYXTxEe29EM7zgtpvCg(final Context ctx) {
		ctx.Get_EntryStateXLiteral_YatzwXTxEe29EM7zgtpvCg = de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.X;
		// branch 'X'
		return SIB_ID._jSVEQXT2Ee29EM7zgtpvCg;
	}
	// container for retrieve enum literal SIB 'Get EntryState'.
	public SIB_ID execute_ZGGTEXTxEe29EM7zgtpvCg(final Context ctx) {
		ctx.Get_EntryStateOLiteral_ZGZ1E3TxEe29EM7zgtpvCg = de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.O;
		// branch 'O'
		return SIB_ID._7qmPuXT2Ee29EM7zgtpvCg;
	}
	// container for retrieve enum literal SIB 'Get TurnState'.
	public SIB_ID execute_c9HA4XTxEe29EM7zgtpvCg(final Context ctx) {
		ctx.Get_TurnStateOLiteral_c9n__HYPHEN_MINUS__QXTxEe29EM7zgtpvCg = de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState.O;
		// branch 'O'
		return SIB_ID._mNc8IXT3Ee29EM7zgtpvCg;
	}
	// container for retrieve enum literal SIB 'Get TurnState'.
	public SIB_ID execute_dnZ7EXTxEe29EM7zgtpvCg(final Context ctx) {
		ctx.Get_TurnStateXLiteral_dn31IXTxEe29EM7zgtpvCg = de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState.X;
		// branch 'X'
		return SIB_ID._mmIh4XT3Ee29EM7zgtpvCg;
	}
	// container for SIB 'Set entryState' setting a new attribute value.
	public SIB_ID execute_jSVEQXT2Ee29EM7zgtpvCg(final Context ctx) {
		ctx.tableentry.setentryState(ctx.Get_EntryStateXLiteral_YatzwXTxEe29EM7zgtpvCg);
		// branch 'success'
		return SIB_ID._c9HA4XTxEe29EM7zgtpvCg;
	}
	// container for SIB 'Set entryState' setting a new attribute value.
	public SIB_ID execute_7qmPuXT2Ee29EM7zgtpvCg(final Context ctx) {
		ctx.tableentry.setentryState(ctx.Get_EntryStateOLiteral_ZGZ1E3TxEe29EM7zgtpvCg);
		// branch 'success'
		return SIB_ID._dnZ7EXTxEe29EM7zgtpvCg;
	}
	// container for SIB 'Set turnState' setting a new attribute value.
	public SIB_ID execute_mNc8IXT3Ee29EM7zgtpvCg(final Context ctx) {
		ctx.table.setturnState(ctx.Get_TurnStateOLiteral_c9n__HYPHEN_MINUS__QXTxEe29EM7zgtpvCg);
		// branch 'success'
		return SIB_ID._eaqXUX3hEe2ONMPeQEJUSA;
	}
	// container for SIB 'Set turnState' setting a new attribute value.
	public SIB_ID execute_mmIh4XT3Ee29EM7zgtpvCg(final Context ctx) {
		ctx.table.setturnState(ctx.Get_TurnStateXLiteral_dn31IXTxEe29EM7zgtpvCg);
		// branch 'success'
		return SIB_ID._e8FCUX3hEe2ONMPeQEJUSA;
	}
	// container for graph abstraction 'checkDraw' and sub process 'checkDraw'.
	public SIB_ID execute_YqfJ4X1cEe2BL67A2MFPXw(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.CheckDraw_9XpDwX1bEe2BL67A2MFPXw instance = new info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.CheckDraw_9XpDwX1bEe2BL67A2MFPXw(ctx.beanManager);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.CheckDraw_9XpDwX1bEe2BL67A2MFPXw.CheckDraw_9XpDwX1bEe2BL67A2MFPXwResult result = instance.execute(false, ctx.table);
	
		switch(result.getBranchName()) {
		case "success": {
			Optional.ofNullable(ctx.table).get().setgameState(result.getSuccessReturn().getState());
			// branch 'success'
			return SIB_ID._KS8tEX3fEe2ONMPeQEJUSA;
		}
			default: throw new IllegalStateException("SIB 'checkDraw' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for atomic SIB 'checkWin'.
	public SIB_ID execute_KS8tEX3fEe2ONMPeQEJUSA(final Context ctx) {
		if (info.scce.dime.app.game.Native.checkWin(ctx.table)) {
			// branch 'true'
			return SIB_ID._PyrFIX3fEe2ONMPeQEJUSA;
		}
		else {
			// branch 'false'
			return SIB_ID._LhthA3TxEe29EM7zgtpvCg;
		}
	}
	// container for retrieve enum literal SIB 'Get GameState'.
	public SIB_ID execute_PyrFIX3fEe2ONMPeQEJUSA(final Context ctx) {
		Optional.ofNullable(ctx.table).get().setgameState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState.win);
		// branch 'win'
		return SIB_ID._vASWsX3qEe2ONMPeQEJUSA;
	}
	// container for SIB 'Set stateValue' setting a new attribute value.
	public SIB_ID execute_eaqXUX3hEe2ONMPeQEJUSA(final Context ctx) {
		ctx.tableentry.setstateValue(0l);
		// branch 'success'
		return SIB_ID._L1DQoX3tEe2ONMPeQEJUSA;
	}
	// container for SIB 'Set stateValue' setting a new attribute value.
	public SIB_ID execute_e8FCUX3hEe2ONMPeQEJUSA(final Context ctx) {
		ctx.tableentry.setstateValue(1l);
		// branch 'success'
		return SIB_ID._N7GXIX3tEe2ONMPeQEJUSA;
	}
	// container for SIB 'Set isWin' setting a new attribute value.
	public SIB_ID execute_vASWsX3qEe2ONMPeQEJUSA(final Context ctx) {
		ctx.table.setisWin(true);
		// branch 'success'
		return SIB_ID._hxEisX8DEe29IvxJUcVYFw;
	}
	// container for SIB 'Set turnText' setting a new attribute value.
	public SIB_ID execute_L1DQoX3tEe2ONMPeQEJUSA(final Context ctx) {
		ctx.table.setturnText("X");
		// branch 'success'
		return SIB_ID._YqfJ4X1cEe2BL67A2MFPXw;
	}
	// container for SIB 'Set turnText' setting a new attribute value.
	public SIB_ID execute_N7GXIX3tEe2ONMPeQEJUSA(final Context ctx) {
		ctx.table.setturnText("O");
		// branch 'success'
		return SIB_ID._YqfJ4X1cEe2BL67A2MFPXw;
	}
	// container for switch enum SIB 'Switch TurnState'.
	public SIB_ID execute_hxEisX8DEe29IvxJUcVYFw(final Context ctx) {
		if(Optional.ofNullable(ctx.table).map(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table::getturnState).orElse(null) == null) {
			// branch 'else'
			return SIB_ID._LhthA3TxEe29EM7zgtpvCg;
		}
	
		switch(Optional.ofNullable(ctx.table).map(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table::getturnState).orElse(null).toString()){
			case "X": // branch 'X'
			return SIB_ID._5U71oX8DEe29IvxJUcVYFw;
			case "O": // branch 'O'
			return SIB_ID._6OkMUX8DEe29IvxJUcVYFw;
			default : // branch 'else'
			return SIB_ID._LhthA3TxEe29EM7zgtpvCg;
		}
	}
	// container for atomic SIB 'IntegerAdd'.
	public SIB_ID execute_5U71oX8DEe29IvxJUcVYFw(final Context ctx) {
		try {
			final java.lang.Long result = info.scce.dime.common.CommonNativeIntegerServiceLibrary.add(Optional.ofNullable(ctx.leaderboard).map(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard::getoWins).orElse(0l), 1l);
			Optional.ofNullable(ctx.leaderboard).get().setoWins(result);
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'IntegerAdd' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._LhthA3TxEe29EM7zgtpvCg;
	}
	// container for atomic SIB 'IntegerAdd'.
	public SIB_ID execute_6OkMUX8DEe29IvxJUcVYFw(final Context ctx) {
		try {
			final java.lang.Long result = info.scce.dime.common.CommonNativeIntegerServiceLibrary.add(Optional.ofNullable(ctx.leaderboard).map(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard::getxWins).orElse(0l), 1l);
			Optional.ofNullable(ctx.leaderboard).get().setxWins(result);
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'IntegerAdd' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._LhthA3TxEe29EM7zgtpvCg;
	}
	
}  
