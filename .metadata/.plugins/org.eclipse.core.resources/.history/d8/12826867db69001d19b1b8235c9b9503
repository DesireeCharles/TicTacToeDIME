package de.ls5.dywa.generated.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.persistence.OptimisticLockException;
import javax.resource.ResourceException;

import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.IOUtils;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xadisk.additional.XAFileInputStreamWrapper;
import org.xadisk.bridge.proxies.interfaces.Session;
import org.xadisk.bridge.proxies.interfaces.XAFileInputStream;
import org.xadisk.bridge.proxies.interfaces.XAFileOutputStream;
import org.xadisk.connector.outbound.XADiskConnection;
import org.xadisk.connector.outbound.XADiskConnectionFactory;
import org.xadisk.filesystem.exceptions.DirectoryNotEmptyException;
import org.xadisk.filesystem.exceptions.FileAlreadyExistsException;
import org.xadisk.filesystem.exceptions.FileNotExistsException;
import org.xadisk.filesystem.exceptions.FileUnderUseException;
import org.xadisk.filesystem.exceptions.InsufficientPermissionOnFileException;
import org.xadisk.filesystem.exceptions.LockingFailedException;
import org.xadisk.filesystem.exceptions.NoTransactionAssociatedException;

/**
 * Responsible for data storage.
 */
@RequestScoped
public class StorageManager {

	private final static Logger LOGGER = LoggerFactory.getLogger(StorageManager.class);

	/**
	 * The XADisk file system accessor factory.
	 */
	@Resource(mappedName = "java:jboss/eis/XADiskConnection")
	private XADiskConnectionFactory xaDiskConnectionFactory;

	/**
	 * The shared MIME type detector. This is stateless and thread-safe and will therefore be shared between all
	 * instances of this bean.
	 */
	private static final Detector MIME_DETECTOR = new DefaultDetector();

	/**
	 * The root path for file storage. All files are saved in this directory; named by the associated {@link DBFile}'s
	 * ID.
	 */
	private static final File STORAGE_ROOT;

	private static final File NATIVE_DOMAIN_STORAGE_ROOT;

	static {
		final Properties fileStorageProperties = new Properties();
		try {
			fileStorageProperties
					.loadFromXML(StorageManager.class.getClassLoader().getResourceAsStream("/META-INF/properties.xml"));
		}
		catch (final InvalidPropertiesFormatException e) {
			throw new IllegalStateException(e);
		}
		catch (final IOException e) {
			throw new IllegalStateException(e);
		}

		// Property is set in standalone.xml of Wildfly
		final String JBOSS_HOME_ENV = "de.ls5.dywa.JBOSS_HOME";
		final String JBOSS_HOME = System.getProperty(JBOSS_HOME_ENV);

		if (JBOSS_HOME == null || JBOSS_HOME.isEmpty()) {
			// store files in tmp dir
			try {
				final File tempDir = Files.createTempDirectory(null).toFile();

				LOGGER.warn("'" + JBOSS_HOME_ENV + "' not specified. Using '" + tempDir.getPath()
						+ "' to TEMPORARILY store files");

				STORAGE_ROOT = new File(tempDir, fileStorageProperties.getProperty("file-storage"));
				NATIVE_DOMAIN_STORAGE_ROOT =
						new File(tempDir, fileStorageProperties.getProperty("native-domain-storage"));
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		else {
			STORAGE_ROOT =
					new File(JBOSS_HOME + File.separatorChar + fileStorageProperties.getProperty("file-storage"));
			NATIVE_DOMAIN_STORAGE_ROOT = new File(
					JBOSS_HOME + File.separatorChar + fileStorageProperties.getProperty("native-domain-storage"));
		}

		if (!STORAGE_ROOT.isDirectory()) {
			if (!STORAGE_ROOT.mkdirs()) {
				throw new IllegalStateException("could not create storage directory");
			}
		}

		if (!NATIVE_DOMAIN_STORAGE_ROOT.isDirectory()) {
			if (!NATIVE_DOMAIN_STORAGE_ROOT.mkdirs()) {
				throw new IllegalStateException("could not create app storage directory");
			}
		}
	}

	public XADiskConnectionFactory getXaDiskConnectionFactory() {
		return xaDiskConnectionFactory;
	}

	/**
	 * Returns the MIME detector
	 *
	 * @return
	 */
	public static Detector getMimeDetector() {
		return MIME_DETECTOR;
	}

	/**
	 * Returns the root of DyWA storage
	 *
	 * @return
	 */
	public static File getStorageRoot() {
		return STORAGE_ROOT;
	}

	/**
	 * Returns the root of the generated application storage
	 *
	 * @return
	 */
	public static File getNativeDomainStorageRoot() {
		return NATIVE_DOMAIN_STORAGE_ROOT;
	}

	/**
	 * Identify the content (MIME) type of an {@link InputStream}'s contents and store it in the {@link DBFile}'s
	 * content type field. {@link IOException}s are rethrown as {@link IllegalStateException}s since no graceful
	 * in-app-server handling is possible.
	 *
	 * @param dataInput the {@link InputStream} to identify, should be an {@link TikaInputStream}.
	 */
	public String getContentType(final InputStream dataInput) {
		MediaType mimeType;
		try {
			mimeType = MIME_DETECTOR.detect(dataInput, new Metadata());
		}
		catch (IOException e) {
			throw new IllegalStateException(e);
		}

		return mimeType.toString();
	}

	/**
	 * Call {@link IOUtils#copy(InputStream, OutputStream)}, wrapping any {@link IOException}s as
	 * {@link IllegalStateException}s.
	 *
	 * @param input  the stream to read from.
	 * @param output the stream to copy into.
	 * @see IOUtils#copy(InputStream, OutputStream)
	 */
	public void copyStreams(InputStream input, OutputStream output) {
		try {
			IOUtils.copy(input, output);
		}
		catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	public InputStream getFile(File fsFile) {
		final InputStream fsFileInput;

		try {
			if (Files.isSymbolicLink(fsFile.toPath())) {
				fsFile = Files.readSymbolicLink(fsFile.toPath()).toFile(); // extract real path
			}
			fsFileInput = new XAFileInputStreamWrapper(this.createXAFileInputStream(fsFile));
		}
		// FIXME if file not found an InsufficientPermissionOnFileException is thrown instead of FileNotExistsException.
		// So here we catch Exception :(.
		catch (final Exception e) {
			throw new RuntimeException(e);
		}

		return fsFileInput;
	}

	/**
	 * Connect to the XADisk instance, refusing to handle any exceptions.
	 *
	 * @return a {@link XADiskConnection}, caller is responsible to {@link XADiskConnection#close()}.
	 */
	private XADiskConnection getConnection() {
		try {
			return getXaDiskConnectionFactory().getConnection();
		}
		catch (final ResourceException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Wraps the {@link Session#createFile(File, boolean)} method that declares several unlikely or impossible checked
	 * exception. This method handles cleanup of these exceptions. This method only creates files, not directories.
	 *
	 * @param file the file to create.
	 * @throws FileAlreadyExistsException if the file was already created.
	 */
	public void createFile(final File file) throws FileAlreadyExistsException {
		final XADiskConnection fileSystem = this.getConnection();

		try {
			fileSystem.createFile(file, false);

		}
		catch (final FileNotExistsException e) {
			// if the directory does not exist, config error
			throw new IllegalStateException(e);

		}
		catch (final InsufficientPermissionOnFileException e) {
			// if the directory has bad permissions, config error
			throw new IllegalStateException(e);

		}
		catch (final LockingFailedException e) {
			// wrap it as a db-style exception
			throw new OptimisticLockException(e);

		}
		catch (final NoTransactionAssociatedException e) {
			// can not happen, app server malfunction
			throw new IllegalStateException(e);

		}
		catch (final InterruptedException e) {
			// can not happen, app server malfunction
			throw new IllegalStateException(e);

		}
		finally {
			fileSystem.close();
		}
	}

	/**
	 * Creates a symbolic link
	 *
	 * @param from
	 * @param to
	 * @return
	 */
	public static boolean makeSymLink(Path src, Path target) {
		try {
			Files.deleteIfExists(src);
			Files.createSymbolicLink(src, target);
			return true;
		}
		catch (IOException | UnsupportedOperationException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Wraps the {@link Session#createXAFileInputStream(File, boolean)} method that declares several unlikely or
	 * impossible checked exception. This method handles cleanup of these exceptions.
	 *
	 * @param file the file to read from.
	 * @return the {@link XAFileInputStream} linked to the file's contents.
	 * @throws FileNotExistsException if the requested file does not exist.
	 */
	private XAFileInputStream createXAFileInputStream(final File file) throws FileNotExistsException {
		final XADiskConnection fileSystem = this.getConnection();

		try {
			return fileSystem.createXAFileInputStream(file, false);

		}
		catch (final InsufficientPermissionOnFileException e) {
			// caller must ensure file permissions are good
			throw new IllegalArgumentException(e);

		}
		catch (final LockingFailedException e) {
			// wrap it as a db-style exception
			throw new OptimisticLockException(e);

		}
		catch (final NoTransactionAssociatedException e) {
			// can not happen, app server malfunction
			throw new IllegalStateException(e);

		}
		catch (final InterruptedException e) {
			// can not happen, app server malfunction
			throw new IllegalStateException(e);

		}
		finally {
			fileSystem.close();
		}
	}

	/**
	 * Wraps the {@link Session#createXAFileOutputStream(File, boolean)} method that declares several unlikely or
	 * impossible checked exception. This method handles cleanup of these exceptions.
	 *
	 * @param file the file to write to.
	 * @return the {@link XAFileOutputStream} linked to the file's contents.
	 */
	public XAFileOutputStream createXAFileOutputStream(final File file) {
		final XADiskConnection fileSystem = this.getConnection();

		try {
			return fileSystem.createXAFileOutputStream(file, true);

		}
		catch (final FileNotExistsException e) {
			// caller must ensure file exists
			throw new IllegalArgumentException(e);

		}
		catch (final FileUnderUseException e) {
			// wrap it as a db-style exception
			throw new OptimisticLockException(e);

		}
		catch (final InsufficientPermissionOnFileException e) {
			// caller must ensure file permissions are good
			throw new IllegalArgumentException(e);

		}
		catch (final LockingFailedException e) {
			// wrap it as a db-style exception
			throw new OptimisticLockException(e);

		}
		catch (final NoTransactionAssociatedException e) {
			// can not happen, app server malfunction
			throw new IllegalStateException(e);

		}
		catch (final InterruptedException e) {
			// can not happen, app server malfunction
			throw new IllegalStateException(e);

		}
		finally {
			fileSystem.close();
		}
	}

	/**
	 * Wraps the {@link Session#deleteFile(File)} method that declares several unlikely or impossible checked exception.
	 * This method handles cleanup of these exceptions.
	 *
	 * @param file the file to create.
	 */
	public void deleteFile(final File file) {
		final XADiskConnection fileSystem = this.getConnection();

		try {
			if (Files.isSymbolicLink(file.toPath())) { // symlink: safe delete
				fileSystem.deleteFile(file);
			}
			else {
				boolean symLinkFound = false;
				if (file.getParentFile()
						.equals(STORAGE_ROOT)) { // dywa file: check if domain file links to it and eventually replace it with the original
					try {
						for (File symLink : NATIVE_DOMAIN_STORAGE_ROOT
								.listFiles(f -> Files.isSymbolicLink(f.toPath()))) { // domain symlinks
							if (Files.readSymbolicLink(symLink.toPath()).equals(file.toPath())) {
								symLinkFound = true;
								String newName = symLink.getName(); // get name
								fileSystem.deleteFile(symLink); // delete symlink before moving
								fileSystem.moveFile(file,
										new File(NATIVE_DOMAIN_STORAGE_ROOT, newName)); // replace it with the new one
								break;
							}
						}
					}
					catch (FileAlreadyExistsException | IOException e) {
						throw new IllegalStateException(e);
					}
				}
				else if (file.getParentFile()
						.equals(NATIVE_DOMAIN_STORAGE_ROOT)) { // domain file: check if DyWA file links to it and eventually replace it with the original
					try {
						for (File symLink : STORAGE_ROOT
								.listFiles(f -> Files.isSymbolicLink(f.toPath()))) { // DyWA symlinks
							if (Files.readSymbolicLink(symLink.toPath()).equals(file.toPath())) {
								symLinkFound = true;
								String newName = symLink.getName(); // get name
								fileSystem.deleteFile(symLink); // delete symlink before moving
								fileSystem
										.moveFile(file, new File(STORAGE_ROOT, newName)); // replace it with the new one
								break;
							}
						}
					}
					catch (FileAlreadyExistsException | IOException e) {
						throw new IllegalStateException(e);
					}
				}
				else
					throw new RuntimeException("Unknown parent directory of file.");

				if (!symLinkFound) {
					fileSystem.deleteFile(file); // no symlink found: delete normally
				}
			}

		}
		catch (final DirectoryNotEmptyException e) {
			// caller must ensure to call with real file
			throw new IllegalStateException(e);

		}
		catch (final FileNotExistsException e) {
			// if the directory does not exist, config error
			throw new IllegalStateException(e);

		}
		catch (final FileUnderUseException e) {
			// wrap it as a db-style exception
			throw new OptimisticLockException(e);

		}
		catch (final InsufficientPermissionOnFileException e) {
			// if the directory has bad permissions, config error
			throw new IllegalStateException(e);

		}
		catch (final LockingFailedException e) {
			// wrap it as a db-style exception
			throw new OptimisticLockException(e);

		}
		catch (final NoTransactionAssociatedException e) {
			// can not happen, app server malfunction
			throw new IllegalStateException(e);

		}
		catch (final InterruptedException e) {
			// can not happen, app server malfunction
			throw new IllegalStateException(e);

		}
		finally {
			fileSystem.close();
		}
	}
}
