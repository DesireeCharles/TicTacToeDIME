package info.scce.dime.util;

import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

public class CDIUtil {

	public static <T> T getManagedInstance(Class<T> clazz) {
		return getManagedInstance(CDI.current().getBeanManager(), clazz);
	}

	public static <T> T getManagedInstance(BeanManager bm, Class<T> clazz) {
		final Set<Bean<?>> beans = bm.getBeans(clazz);
		final Bean<?> bean = bm.resolve(beans);
		final CreationalContext<?> cctx = bm.createCreationalContext(bean);
		return (T) bm.getReference(bean, clazz, cctx);
	}

}
