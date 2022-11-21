package info.scce.dime.rest;

import org.jboss.resteasy.spi.DefaultOptionsMethodException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RESTOptionsExceptionMapper implements ExceptionMapper<DefaultOptionsMethodException> {

    @Override
    public Response toResponse(DefaultOptionsMethodException e) {
        return Response.ok().build();
    }
}
