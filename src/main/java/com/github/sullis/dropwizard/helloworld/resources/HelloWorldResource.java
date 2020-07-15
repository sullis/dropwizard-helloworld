package com.github.sullis.dropwizard.helloworld.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.github.sullis.dropwizard.helloworld.api.HelloMessage;
import java.util.Optional;

@Path("/helloworld")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    public HelloWorldResource() {  }

    @GET
    public HelloMessage get(@QueryParam("name") Optional<String> name) {
        HelloMessage hello = new HelloMessage();
        hello.setMessage(("Hello " + name.orElse("")).trim());
        return hello;
    }
}
