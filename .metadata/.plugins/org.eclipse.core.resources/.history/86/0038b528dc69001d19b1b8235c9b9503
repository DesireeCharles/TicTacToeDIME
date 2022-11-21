package de.ls5.dywa.generated.rest.util;

@javax.transaction.Transactional
@javax.ws.rs.Path("/files")
public class FileReferenceREST {
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController DomainFileController;
		

	@javax.ws.rs.POST
	@javax.ws.rs.Path("create")
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.MULTIPART_FORM_DATA)
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response create(final org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput input) throws java.io.IOException {
		

		final java.util.List<org.jboss.resteasy.plugins.providers.multipart.InputPart> inputParts = input.getFormDataMap().get("file");

		if (inputParts == null || inputParts.isEmpty()) {
			throw new javax.ws.rs.WebApplicationException("invalid request");
		}

		final org.jboss.resteasy.plugins.providers.multipart.InputPart inputPart = inputParts.get(0);
		final javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.String> header = inputPart.getHeaders();

		java.lang.String fileName = "unknown";
		final java.lang.String[] contentDisposition = header.getFirst("Content-Disposition").split(";");


		for (java.lang.String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {
				final java.lang.String[] name = filename.split("=");
				fileName = name[1].trim().replaceAll("\"", "");
				break;
			}
		}

		final de.ls5.dywa.generated.util.FileReference reference =
				this.DomainFileController.storeFile(fileName, inputPart.getBody(java.io.InputStream.class, null));

		return javax.ws.rs.core.Response.ok(new de.ls5.dywa.generated.rest.util.FileReference(reference)).build();
	}
}
