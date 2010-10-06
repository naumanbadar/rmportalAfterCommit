package org.ow2.proactive_grid_cloud_portal.server;

import java.io.InputStream;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.client.ClientResponse;

/**
 * @author ffonteno
 * 
 *         Interface defining a client for the REST service
 */
@Path("/")
public interface RestClient {

	@POST
	@Path("/rm/login")
	@Produces("text/plain")
	public ClientResponse<String> loginRM(@FormParam("username") String username, @FormParam("password") String password);

	@GET
	@Path("/rm/state")
	@Produces("application/json")
	public ClientResponse<InputStream> state(@HeaderParam("sessionid") String sessionId);

	@GET
	@Path("/rm/monitoring")
	public ClientResponse<InputStream> monitor(@HeaderParam("sessionid") String sessionId);

}
