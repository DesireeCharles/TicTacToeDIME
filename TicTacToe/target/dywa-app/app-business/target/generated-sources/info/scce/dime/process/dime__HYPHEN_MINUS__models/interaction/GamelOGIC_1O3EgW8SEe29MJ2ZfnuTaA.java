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

public final class GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.Table table;
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Leaderboard startLeaderboard_nkPwUX8FEe29IvxJUcVYFw;
				private de.ls5.dywa.generated.rest.types.Table drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA;
				private de.ls5.dywa.generated.rest.types.TableEntry GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.table != null) {
						result.table = de.ls5.dywa.generated.rest.types.Table.fromDywaEntity(ctx.table, objectCache);
						de.ls5.dywa.generated.rest.types.TableSelective.copy(ctx.table, result.table, objectCache);
					}
					if(ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw != null) {
						result.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw = de.ls5.dywa.generated.rest.types.Leaderboard.fromDywaEntity(ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw, objectCache);
						de.ls5.dywa.generated.rest.types.LeaderboardSelective.copy(ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw, result.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw, objectCache);
					}
					if(ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA != null) {
						result.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA = de.ls5.dywa.generated.rest.types.Table.fromDywaEntity(ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA, objectCache);
						de.ls5.dywa.generated.rest.types.TableSelective.copy(ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA, result.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA, objectCache);
					}
					if(ctx.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A != null) {
						result.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A = de.ls5.dywa.generated.rest.types.TableEntry.fromDywaEntity(ctx.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A, objectCache);
						de.ls5.dywa.generated.rest.types.TableEntrySelective.copy(ctx.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A, result.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.table != null) {
						result.table = contextTransformer.transform(this.table);
					}
					if (this.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw != null) {
						result.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw = contextTransformer.transform(this.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw);
					}
					if (this.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA != null) {
						result.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA = contextTransformer.transform(this.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA);
					}
					if (this.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A != null) {
						result.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A = contextTransformer.transform(this.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A);
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

		// context variables.
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table table;
		// direct dataflow variables.
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard startLeaderboard_nkPwUX8FEe29IvxJUcVYFw;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_jMekQXSQEe2vmrlDP84GiQ,
	_AqwwIXTyEe29EM7zgtpvCg,
	_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A,
	_Da1IUX0nEe2__HYPHEN_MINUS__urIT6LmdwA,
	_Tnh5EX0qEe2__HYPHEN_MINUS__urIT6LmdwA,
	_AV2zQX1aEe2BL67A2MFPXw,
	_w__HYPHEN_MINUS__qcUX8FEe29IvxJUcVYFw,
	_5ChlEX8FEe29IvxJUcVYFw,
	_6XLq4X8FEe29IvxJUcVYFw,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard leaderboard) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw = leaderboard;
		ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw = leaderboard;
		ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw = leaderboard;
		ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw = leaderboard;
		
		return ctx;
	}

	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard leaderboard) {
		final Context ctx = createContext(leaderboard);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._6XLq4X8FEe29IvxJUcVYFw);
	}
	
	
	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard leaderboard) {
		final Context ctx = createContext(leaderboard);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._6XLq4X8FEe29IvxJUcVYFw);
	}

	@Override
	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_XiL-0XbqEe2qntwH9Ijd8A": return executeInternal(ctx, continue_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _jMekQXSQEe2vmrlDP84GiQ: {
					curr = execute_jMekQXSQEe2vmrlDP84GiQ(ctx);
					break;
				}
				case _AqwwIXTyEe29EM7zgtpvCg: {
					curr = execute_AqwwIXTyEe29EM7zgtpvCg(ctx);
					break;
				}
				case _XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A: {
					curr = execute_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A(ctx);
					break;
				}
				case _Da1IUX0nEe2__HYPHEN_MINUS__urIT6LmdwA: {
					curr = execute_Da1IUX0nEe2__HYPHEN_MINUS__urIT6LmdwA(ctx);
					break;
				}
				case _Tnh5EX0qEe2__HYPHEN_MINUS__urIT6LmdwA: {
					curr = execute_Tnh5EX0qEe2__HYPHEN_MINUS__urIT6LmdwA(ctx);
					break;
				}
				case _AV2zQX1aEe2BL67A2MFPXw: {
					curr = execute_AV2zQX1aEe2BL67A2MFPXw(ctx);
					break;
				}
				case _w__HYPHEN_MINUS__qcUX8FEe29IvxJUcVYFw: {
					return execute_w__HYPHEN_MINUS__qcUX8FEe29IvxJUcVYFw(ctx);
				}
				case _5ChlEX8FEe29IvxJUcVYFw: {
					curr = execute_5ChlEX8FEe29IvxJUcVYFw(ctx);
					break;
				}
				case _6XLq4X8FEe29IvxJUcVYFw: {
					curr = execute_6XLq4X8FEe29IvxJUcVYFw(ctx);
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
	public static class GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private BackReturn back;
		
		public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult(BackReturn back) {
			this.branchName = "back";
			this.branchId = "_w__HYPHEN_MINUS__qcUX8FEe29IvxJUcVYFw";
			this.back = back;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public BackReturn getBackReturn() {
			return back;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>back</code>.
		 */
		public interface BackReturn {
		}
	
		/**
		 * Return type of branch <code>back</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class BackReturnImpl implements BackReturn {

			private final Context ctx;

	        BackReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// container for retrieve enum literal SIB 'Get TurnState'.
	public SIB_ID execute_jMekQXSQEe2vmrlDP84GiQ(final Context ctx) {
		Optional.ofNullable(ctx.table).get().setturnState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState.X);
		// branch 'X'
		return SIB_ID._Tnh5EX0qEe2__HYPHEN_MINUS__urIT6LmdwA;
	}
	// container for graph abstraction 'showButtonPress' and sub process 'showButtonPress'.
	public SIB_ID execute_AqwwIXTyEe29EM7zgtpvCg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.ShowButtonPress_LhjwAXTxEe29EM7zgtpvCg instance = new info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.ShowButtonPress_LhjwAXTxEe29EM7zgtpvCg(ctx.beanManager);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.ShowButtonPress_LhjwAXTxEe29EM7zgtpvCg.ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult result = instance.execute(false, ctx.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A, ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw, ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A;
		}
			default: throw new IllegalStateException("SIB 'showButtonPress' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB Game _XiL-0XbqEe2qntwH9Ijd8A
	private static class InputsForGUISIB_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A {
		public de.ls5.dywa.generated.rest.types.Table
		 table;
		public de.ls5.dywa.generated.rest.types.Leaderboard
		 leaderboard;
	}
	
	
	// container for GUI SIB 'Game'.
	public SIB_ID execute_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.TableREST inputsTableREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.TableREST.class);
		final de.ls5.dywa.generated.rest.controller.LeaderboardREST inputsLeaderboardREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.LeaderboardREST.class);
		
		final InputsForGUISIB_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A inputs = new InputsForGUISIB_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A();
		
		{
			de.ls5.dywa.generated.rest.types.Table
			 result = null;
			de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table obj = ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA;
			
			de.ls5.dywa.generated.rest.types.Table restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_GameTableSelectivex1_AzVAIWnXEe2xCJpb6ooUzA
					restTO = inputsTableREST.read_GameTableSelectivex1_AzVAIWnXEe2xCJpb6ooUzA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Table.fromDywaEntity(obj, objectCache);
					}
					// GameTableSelectivex1_AzVAIWnXEe2xCJpb6ooUzA
					de.ls5.dywa.generated.rest.types.GameTableSelectivex1_AzVAIWnXEe2xCJpb6ooUzA.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.table = result;
		}
		{
			de.ls5.dywa.generated.rest.types.Leaderboard
			 result = null;
			de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard obj = ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw;
			
			de.ls5.dywa.generated.rest.types.Leaderboard restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_GameLeaderboardSelectivex2_AzVAIWnXEe2xCJpb6ooUzA
					restTO = inputsLeaderboardREST.read_GameLeaderboardSelectivex2_AzVAIWnXEe2xCJpb6ooUzA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Leaderboard.fromDywaEntity(obj, objectCache);
					}
					// GameLeaderboardSelectivex2_AzVAIWnXEe2xCJpb6ooUzA
					de.ls5.dywa.generated.rest.types.GameLeaderboardSelectivex2_AzVAIWnXEe2xCJpb6ooUzA.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.leaderboard = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA:_XiL-0XbqEe2qntwH9Ijd8A:_AzVAIWnXEe2xCJpb6ooUzA", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_XiL-0XbqEe2qntwH9Ijd8A", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_XiL-0XbqEe2qntwH9Ijd8A");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult result = (info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult) guiResult;
		if ("empty".equals(result.getBranchName())) {
			if(result.getgui___1OZgXPkEe2eGKutfpiSKwemptyReturn() != null) {
			ctx.GameEmptyTableEntry_XiZaMXbqEe2qntwH9Ijd8A = (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry)result.getgui___1OZgXPkEe2eGKutfpiSKwemptyReturn().getTableEntry();
			}
			// branch 'empty'
			return SIB_ID._AqwwIXTyEe29EM7zgtpvCg;
		} else 
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._w__HYPHEN_MINUS__qcUX8FEe29IvxJUcVYFw;
		} else 
		if ("Restart".equals(result.getBranchName())) {
			// branch 'Restart'
			return SIB_ID._Da1IUX0nEe2__HYPHEN_MINUS__urIT6LmdwA;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A(ctx);
		}
	}
	// container for atomic SIB 'drawBoard'.
	public SIB_ID execute_Da1IUX0nEe2__HYPHEN_MINUS__urIT6LmdwA(final Context ctx) {
		try {
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table result = info.scce.dime.app.game.Native.createGameBoard(3l, 3l);
			ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA = result;
			ctx.table = result;
			ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA = result;
			ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'drawBoard' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._jMekQXSQEe2vmrlDP84GiQ;
	}
	// container for retrieve enum literal SIB 'Get GameState'.
	public SIB_ID execute_Tnh5EX0qEe2__HYPHEN_MINUS__urIT6LmdwA(final Context ctx) {
		Optional.ofNullable(ctx.table).get().setgameState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameState.progress);
		// branch 'progress'
		return SIB_ID._AV2zQX1aEe2BL67A2MFPXw;
	}
	// container for SIB 'Set isWin' setting a new attribute value.
	public SIB_ID execute_AV2zQX1aEe2BL67A2MFPXw(final Context ctx) {
		ctx.drawBoardSuccessTable_Dds2IX0nEe2__HYPHEN_MINUS__urIT6LmdwA.setisWin(false);
		// branch 'success'
		return SIB_ID._XiL__HYPHEN_MINUS__0XbqEe2qntwH9Ijd8A;
	}
	// container for graph i/o 'back'.
	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult execute_w__HYPHEN_MINUS__qcUX8FEe29IvxJUcVYFw(final Context ctx) {
		return new GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult(new BackReturnImpl(ctx));
	}
	// container for SIB 'Set oWins' setting a new attribute value.
	public SIB_ID execute_5ChlEX8FEe29IvxJUcVYFw(final Context ctx) {
		ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw.setoWins(0l);
		// branch 'success'
		return SIB_ID._Da1IUX0nEe2__HYPHEN_MINUS__urIT6LmdwA;
	}
	// container for SIB 'Set xWins' setting a new attribute value.
	public SIB_ID execute_6XLq4X8FEe29IvxJUcVYFw(final Context ctx) {
		ctx.startLeaderboard_nkPwUX8FEe29IvxJUcVYFw.setxWins(0l);
		// branch 'success'
		return SIB_ID._5ChlEX8FEe29IvxJUcVYFw;
	}
	
}  
