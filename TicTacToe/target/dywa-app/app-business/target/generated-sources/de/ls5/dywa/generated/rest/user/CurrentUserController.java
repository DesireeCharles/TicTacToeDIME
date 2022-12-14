// generated by info.scce.dime.generator.rest.SelectiveUserGenerator
package de.ls5.dywa.generated.rest.user;

@javax.transaction.Transactional
@javax.ws.rs.Path("/user/current")
public class CurrentUserController {
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.BaseUserController subjectController;

	@javax.inject.Inject
	private info.scce.dime.rest.ObjectCache objectCache;
	
	
	public <T> T getCurrentUser(final Class<T> userType) {
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser subject = subjectController.read((Long)org.apache.shiro.SecurityUtils.getSubject().getPrincipal());

		for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser concreteUser: subject.getconcreteUser_ConcreteUser()) {
			if (userType.isAssignableFrom(concreteUser.getClass())) {
				return (T)concreteUser;
			}
		}
		throw new IllegalStateException("Did not find concrete user of type '" + userType.getSimpleName() + "'");
	}
}
