package com.stress.test;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class MainResource {

    @Inject
    MainService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> hello() {
        return service.getUsers();
    }
}