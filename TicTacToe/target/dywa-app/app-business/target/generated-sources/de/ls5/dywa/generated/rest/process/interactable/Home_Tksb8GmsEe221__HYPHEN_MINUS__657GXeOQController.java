package de.ls5.dywa.generated.rest.process.interactable;

import java.util.List;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/start/Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQ")
public class Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQController {


	@javax.inject.Inject
	private info.scce.dime.rest.ObjectCache objectCache;
	@javax.inject.Inject
	private info.scce.dime.process.models.Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQ process;
	
	// controller for fetching dywa entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
		@javax.ws.rs.POST
		@javax.ws.rs.Path("public")
		@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public javax.ws.rs.core.Response execute(Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQInput ctx) {
				Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQOutput result = new Home_Tksb8GmsEe221__HYPHEN_MINUS__657GXeOQOutput(this.process.execute(false),objectCache);
				return javax.ws.rs.core.Response.ok(result).build();
		}
		
	
}
