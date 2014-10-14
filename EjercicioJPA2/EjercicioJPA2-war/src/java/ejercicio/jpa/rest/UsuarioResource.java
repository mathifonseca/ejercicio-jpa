package ejercicio.jpa.rest;

import ejercicio.jpa.ejb.SistemaBean;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("usuario")
public class UsuarioResource {

    @Context
    private UriInfo context;
    
    @EJB
    private SistemaBean ejb;

    public UsuarioResource() {
    }

    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response get(@PathParam(value = "id") Long id) {
        try {
            return null;//Response.ok(ejb.getUsuario((id))).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.NOT_FOUND).entity(ex).build();
        }
    }

    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
    
}