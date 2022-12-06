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
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Table drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng;
				private de.ls5.dywa.generated.rest.types.TableEntry GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng != null) {
						result.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng = de.ls5.dywa.generated.rest.types.Table.fromDywaEntity(ctx.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng, objectCache);
						de.ls5.dywa.generated.rest.types.TableSelective.copy(ctx.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng, result.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng, objectCache);
					}
					if(ctx.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ != null) {
						result.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ = de.ls5.dywa.generated.rest.types.TableEntry.fromDywaEntity(ctx.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ, objectCache);
						de.ls5.dywa.generated.rest.types.TableEntrySelective.copy(ctx.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ, result.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng != null) {
						result.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng = contextTransformer.transform(this.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng);
					}
					if (this.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ != null) {
						result.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ = contextTransformer.transform(this.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ);
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
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng;
		private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_Tepc4W8TEe29MJ2ZfnuTaA,
	_CauWwXFhEe24rt9YW3Qgng,
	_jMekQXSQEe2vmrlDP84GiQ,
	_AqwwIXTyEe29EM7zgtpvCg,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._CauWwXFhEe24rt9YW3Qgng);
	}
	
	
	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._CauWwXFhEe24rt9YW3Qgng);
	}

	@Override
	public GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_Tepc4W8TEe29MJ2ZfnuTaA": return executeInternal(ctx, continue_Tepc4W8TEe29MJ2ZfnuTaA(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaAResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _Tepc4W8TEe29MJ2ZfnuTaA: {
					curr = execute_Tepc4W8TEe29MJ2ZfnuTaA(ctx);
					break;
				}
				case _CauWwXFhEe24rt9YW3Qgng: {
					curr = execute_CauWwXFhEe24rt9YW3Qgng(ctx);
					break;
				}
				case _jMekQXSQEe2vmrlDP84GiQ: {
					curr = execute_jMekQXSQEe2vmrlDP84GiQ(ctx);
					break;
				}
				case _AqwwIXTyEe29EM7zgtpvCg: {
					curr = execute_AqwwIXTyEe29EM7zgtpvCg(ctx);
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
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		

	}
	
	// model branches.


	// sibs
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB Game _Tepc4W8TEe29MJ2ZfnuTaA
	private static class InputsForGUISIB_Tepc4W8TEe29MJ2ZfnuTaA {
		public de.ls5.dywa.generated.rest.types.Table
		 table;
	}
	
	
	// container for GUI SIB 'Game'.
	public SIB_ID execute_Tepc4W8TEe29MJ2ZfnuTaA(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.TableREST inputsTableREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.TableREST.class);
		
		final InputsForGUISIB_Tepc4W8TEe29MJ2ZfnuTaA inputs = new InputsForGUISIB_Tepc4W8TEe29MJ2ZfnuTaA();
		
		{
			de.ls5.dywa.generated.rest.types.Table
			 result = null;
			de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table obj = ctx.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng;
			
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
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.GamelOGIC_1O3EgW8SEe29MJ2ZfnuTaA:_Tepc4W8TEe29MJ2ZfnuTaA:_AzVAIWnXEe2xCJpb6ooUzA", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_Tepc4W8TEe29MJ2ZfnuTaA", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_Tepc4W8TEe29MJ2ZfnuTaA(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_Tepc4W8TEe29MJ2ZfnuTaA");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult result = (info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult) guiResult;
		if ("empty".equals(result.getBranchName())) {
			if(result.getgui___1OZgXPkEe2eGKutfpiSKwemptyReturn() != null) {
			ctx.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ = (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry)result.getgui___1OZgXPkEe2eGKutfpiSKwemptyReturn().getTableEntry();
			}
			// branch 'empty'
			return SIB_ID._AqwwIXTyEe29EM7zgtpvCg;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_Tepc4W8TEe29MJ2ZfnuTaA(ctx);
		}
	}
	// container for atomic SIB 'drawBoard'.
	public SIB_ID execute_CauWwXFhEe24rt9YW3Qgng(final Context ctx) {
		try {
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table result = info.scce.dime.app.game.Native.createGameBoard(3l, 3l);
			ctx.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng = result;
			ctx.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng = result;
			ctx.table = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'drawBoard' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._jMekQXSQEe2vmrlDP84GiQ;
	}
	// container for retrieve enum literal SIB 'Get TurnState'.
	public SIB_ID execute_jMekQXSQEe2vmrlDP84GiQ(final Context ctx) {
		Optional.ofNullable(ctx.table).get().setturnState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnState.X);
		// branch 'X'
		return SIB_ID._Tepc4W8TEe29MJ2ZfnuTaA;
	}
	// container for graph abstraction 'showButtonPress' and sub process 'showButtonPress'.
	public SIB_ID execute_AqwwIXTyEe29EM7zgtpvCg(final Context ctx) {
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.ShowButtonPress_LhjwAXTxEe29EM7zgtpvCg instance = new info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.ShowButtonPress_LhjwAXTxEe29EM7zgtpvCg(ctx.beanManager);
	
		final info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.ShowButtonPress_LhjwAXTxEe29EM7zgtpvCg.ShowButtonPress_LhjwAXTxEe29EM7zgtpvCgResult result = instance.execute(false, ctx.GameEmptyTableEntry__dF_kXSjEe2vmrlDP84GiQ, ctx.drawBoardSuccessTable_I2dOoXFiEe24rt9YW3Qgng);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._Tepc4W8TEe29MJ2ZfnuTaA;
		}
			default: throw new IllegalStateException("SIB 'showButtonPress' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	
}  
