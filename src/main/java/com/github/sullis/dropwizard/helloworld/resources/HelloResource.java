package com.github.sullis.dropwizard.helloworld.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import com.github.sullis.dropwizard.helloworld.api.Message;
import java.util.Optional;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloResource {
    private final String defaultName;

    public HelloResource(final String defaultName) {
        this.defaultName = defaultName;
    }

    @GET
    public Message get(@QueryParam("name") Optional<String> name) {
        Message hello = new Message();
        hello.setText(("Hello " + name.orElse(defaultName)));
        return hello;
    }
}
