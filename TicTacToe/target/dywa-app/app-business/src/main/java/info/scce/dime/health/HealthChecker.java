
package info.scce.dime.health;

import org.hibernate.internal.SessionImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.SQLException;

@Transactional
@Path("/health")
public class HealthChecker {

    @PersistenceContext
    private EntityManager em;

    @GET
    @Consumes(MediaType.WILDCARD)
    public Response check() {
        final Connection connection = em.unwrap(SessionImpl.class).connection();
        try {
            connection.isValid(5);
            return Response.ok().build();
        } catch (SQLException ex) {
            return Response.serverError().build();
        }
    }
}
