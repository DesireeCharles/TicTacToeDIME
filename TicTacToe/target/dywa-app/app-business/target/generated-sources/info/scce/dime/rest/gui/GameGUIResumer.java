// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_AzVAIWnXEe2xCJpb6ooUzA")
public class GameGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.TableEntryREST TableEntryREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableEntryController TableEntryController;

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Back/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueBackBranch(info.scce.dime.rest.gui.model._XDpG0XbYEe2qntwH9Ijd8A_INTERNALBranch output) {
		
		checkAuthentication(output.getCallStack(),"_AzVAIWnXEe2xCJpb6ooUzA/Back");
		
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult guiResult = 
		new info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult("Back");
		if(!"_AzVAIWnXEe2xCJpb6ooUzA".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
					output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).setPointer(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getMajorGUI());
		}
		if(!output.getCallStack().getCallFrames().isEmpty()) {
		
			if(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size() - 1).getPointer() == null) {
				return javax.ws.rs.core.Response.status(422).build();
			}
		}
		final Object result = this.processResumer.resumeFromGUI(output.getCallStack(), guiResult);
		return javax.ws.rs.core.Response.ok(result).build();
	}
	@javax.ws.rs.POST
	@javax.ws.rs.Path("empty/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueemptyBranch(info.scce.dime.rest.gui.model.__1OZgXPkEe2eGKutfpiSKwBranch output) {
		
		checkAuthentication(output.getCallStack(),"_AzVAIWnXEe2xCJpb6ooUzA/empty");
		
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry
			 tableEntry;
			if (output.getTableEntry() != null) {
			// create new object
			if (output.getTableEntry().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getTableEntry() instanceof de.ls5.dywa.generated.rest.types.TableEntry) {
					final java.lang.String dywaName;
					if (output.getTableEntry().getDywaName() == null || output.getTableEntry().getDywaName().isEmpty()) {
						dywaName = "tableEntry";
					} else {
						dywaName = output.getTableEntry().getDywaName();
					}
					final long id;
					id = TableEntryREST.create(dywaName);
					output.getTableEntry().setDywaId(id);
					//update_GameTableEntrySelectivex1x1x1x1x1_AzVAIWnXEe2xCJpb6ooUzA
					TableEntryREST.update_BadgeTableEntrySelectivex1_ZlXgoXKOEe2rzNRUfilttw((de.ls5.dywa.generated.rest.types.TableEntry)output.getTableEntry());
					tableEntry = (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry
					) TableEntryController.read(output.getTableEntry().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getTableEntry().getClass()); }	}
			// transient object
			else if (output.getTableEntry().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getTableEntry() instanceof de.ls5.dywa.generated.rest.types.TableEntry) {
					final java.lang.String dywaName;
					if (output.getTableEntry().getDywaName() == null || output.getTableEntry().getDywaName().isEmpty()) {
						dywaName = "tableEntry";
					} else {
						dywaName = output.getTableEntry().getDywaName();
					}
					final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry transientObject;
					if (output.getTableEntry() instanceof de.ls5.dywa.generated.rest.types.TableEntry) {
						transientObject = TableEntryController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getTableEntry().getClass()); }
		
					//update_GameTableEntrySelectivex1x1x1x1x1_AzVAIWnXEe2xCJpb6ooUzA
					TableEntryREST.update_BadgeTableEntrySelectivex1_ZlXgoXKOEe2rzNRUfilttw((de.ls5.dywa.generated.rest.types.TableEntry)output.getTableEntry(), transientObject);
					tableEntry = (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getTableEntry().getClass()); }	}
			// regular object
				else {
					if(output.getTableEntry() instanceof de.ls5.dywa.generated.rest.types.TableEntry) {
						//update_GameTableEntrySelectivex1x1x1x1x1_AzVAIWnXEe2xCJpb6ooUzA
						TableEntryREST.update_BadgeTableEntrySelectivex1_ZlXgoXKOEe2rzNRUfilttw((de.ls5.dywa.generated.rest.types.TableEntry)output.getTableEntry());
						tableEntry = (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry
						) TableEntryController.read(output.getTableEntry().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getTableEntry().getClass()); }		}
			
			}
			else {
				tableEntry = null;
			}
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult.gui___1OZgXPkEe2eGKutfpiSKwemptyReturn guiReturn = new info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult.gui___1OZgXPkEe2eGKutfpiSKwemptyReturn();
		guiReturn.setTableEntry(tableEntry);
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult guiResult = 
		new info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult("empty", guiReturn);
		if(!"_AzVAIWnXEe2xCJpb6ooUzA".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
					output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).setPointer(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getMajorGUI());
		}
		if(!output.getCallStack().getCallFrames().isEmpty()) {
		
			if(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size() - 1).getPointer() == null) {
				return javax.ws.rs.core.Response.status(422).build();
			}
		}
		final Object result = this.processResumer.resumeFromGUI(output.getCallStack(), guiResult);
		return javax.ws.rs.core.Response.ok(result).build();
	}
	@javax.ws.rs.POST
	@javax.ws.rs.Path("Restart/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueRestartBranch(info.scce.dime.rest.gui.model._XDpG0XbYEe2qntwH9Ijd8A_INTERNALBranch output) {
		
		checkAuthentication(output.getCallStack(),"_AzVAIWnXEe2xCJpb6ooUzA/Restart");
		
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult guiResult = 
		new info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.game.Game_AzVAIWnXEe2xCJpb6ooUzAResult("Restart");
		if(!"_AzVAIWnXEe2xCJpb6ooUzA".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
					output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).setPointer(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getMajorGUI());
		}
		if(!output.getCallStack().getCallFrames().isEmpty()) {
		
			if(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size() - 1).getPointer() == null) {
				return javax.ws.rs.core.Response.status(422).build();
			}
		}
		final Object result = this.processResumer.resumeFromGUI(output.getCallStack(), guiResult);
		return javax.ws.rs.core.Response.ok(result).build();
	}
	
}
