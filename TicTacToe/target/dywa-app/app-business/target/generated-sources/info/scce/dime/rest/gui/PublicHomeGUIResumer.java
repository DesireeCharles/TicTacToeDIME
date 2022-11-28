// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_LmrS0Ej8EeaK4_MRcoLfnw")
public class PublicHomeGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Play/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continuePlayBranch(info.scce.dime.rest.gui.model._MF6_kE_LEeauEZ95mLTQ7gBranch output) {
		
		checkAuthentication(output.getCallStack(),"_LmrS0Ej8EeaK4_MRcoLfnw/Play");
		
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.publichome.PublicHome_LmrS0Ej8EeaK4_MRcoLfnwResult guiResult = 
		new info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.publichome.PublicHome_LmrS0Ej8EeaK4_MRcoLfnwResult("Play");
		if(!"_LmrS0Ej8EeaK4_MRcoLfnw".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
