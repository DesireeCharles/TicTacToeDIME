package de.ls5.dywa.generated.util;

import java.io.InputStream;
import java.io.File;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

import de.ls5.dywa.generated.util.DomainFile;
import de.ls5.dywa.generated.util.StorageManager;

@Named
@RequestScoped
public class DomainFileControllerImpl implements DomainFileController {

	@javax.persistence.PersistenceContext
	   private javax.persistence.EntityManager entityManager;

	@Inject
	private StorageManager storageManager;
	
	@Override
	public FileReference getFileReference(final long id) {
		final DomainFile file = entityManager.find(DomainFile.class, id);
		if (file == null) {
			return null;
		}

		return new FileReference(file);
	}

	@Override
	public InputStream loadFile(final FileReference identifier) {
		if (identifier == null) {
			return null;
		}
		File fsFile = getFileForDomainFile(identifier.getDelegate());
		return storageManager.getFile(fsFile);
	}
	
	@Override
	public FileReference storeFile(final String fileName, final InputStream dataStream) {
		final InputStream dataInput = org.apache.tika.io.TikaInputStream.get(dataStream);
		
		final DomainFile result = new DomainFile(fileName, storageManager.getContentType(dataInput));
		entityManager.persist(result);

		final File file = getFileForDomainFile(result);
		try {
			storageManager.createFile(file);
		}
		catch (org.xadisk.filesystem.exceptions.FileAlreadyExistsException e) {
			throw new IllegalStateException("file " + file.toString() + " existed, overwriting...");
		}

		org.xadisk.additional.XAFileOutputStreamWrapper fsFileOutput = new org.xadisk.additional.XAFileOutputStreamWrapper(storageManager.createXAFileOutputStream(file));

		try {
			storageManager.copyStreams(dataInput, fsFileOutput);
		} finally {
			org.apache.tika.io.IOUtils.closeQuietly(fsFileOutput);
			org.apache.tika.io.IOUtils.closeQuietly(dataInput);
		}
		return new FileReference(result);
	}

	@Override
	public void deleteFile(final FileReference identifier) {
		File fsFile = getFileForDomainFile(identifier.getDelegate());
		storageManager.deleteFile(fsFile);
		entityManager.remove(identifier.getDelegate());
	}
	
	private File getFileForDomainFile(final DomainFile domainFile) {
		return new File(StorageManager.getNativeDomainStorageRoot(), Long.toString(domainFile.getId()));
	}
}
