package org.acme.example.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/api/login") // Ajuste no caminho do endpoint
public class LoginResource {

    @Inject
    LoginService loginService;

    @ConfigProperty(name = "app.message")
    String message;

    @POST
    public Response login(LoginRequest loginRequest) { // Import LoginRequest, se necessário
        if (loginService.authenticate(loginRequest.getUsername(), loginRequest.getPassword())) {
            return Response.ok("Login successful: " + message).build();
        } else {
            return Response.status(Response.Status.UNAUTHORIZED).entity("Login failed").build();
        }
    }
}
