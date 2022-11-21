package info.scce.dime.livevariable;

import javax.enterprise.context.Destroyed;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.servlet.ServletRequest;

public interface RequestObserver {

	void afterRequest(
			@Observes
			@Destroyed(RequestScoped.class)
					ServletRequest payload);

}
