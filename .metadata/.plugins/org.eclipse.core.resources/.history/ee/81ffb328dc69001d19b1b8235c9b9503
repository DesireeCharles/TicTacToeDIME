package info.scce.dime.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import info.scce.dime.exception.GUIEncounteredSignal;

@Provider
public class GUISignalMapper implements ExceptionMapper<GUIEncounteredSignal> {

    @Override
    public Response toResponse(GUIEncounteredSignal guiEncounteredSignal) {
        return Response.status(guiEncounteredSignal.getStatus()).entity(guiEncounteredSignal.getGuiResult()).build();
    }
}
