package de.ls5.dywa.generated.util;

public interface DomainFileController {

	public FileReference getFileReference(final long id);

	public java.io.InputStream loadFile(final FileReference identifier);

	public FileReference storeFile(final String fileName, final java.io.InputStream data);

	public void deleteFile(final FileReference identifier);
}
