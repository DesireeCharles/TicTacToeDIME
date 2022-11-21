package info.scce.dime.common;

import java.io.File;
import java.io.InputStream;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

import de.ls5.dywa.generated.util.DomainFileController;

public class CommonNativeFileServiceLibrary {

	public static de.ls5.dywa.generated.util.FileReference uploadProjectResource(final String path) {
		final BeanManager bm = CDI.current().getBeanManager();
		
		final Bean<DomainFileController> bean = (Bean<DomainFileController>) bm.resolve(bm.getBeans(DomainFileController.class));
		final CreationalContext<DomainFileController> cctx = bm.createCreationalContext(bean);
		final DomainFileController fileController = (DomainFileController) bm.getReference(bean, bean.getBeanClass(), cctx);
		
		final InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
		final String[] pathParts = path.split(File.separator);
		final String fileName = pathParts[pathParts.length - 1];
		
		return fileController.storeFile(fileName, inputStream);
	}

}
