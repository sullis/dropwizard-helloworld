# New to Dropwizard?

Dropwizard applications typically have more than one REST endpoint.

Knowing how to add a REST endpoint is a good skill to have.

# Add a new REST endpoint

- locate the HelloResource.java file
- notice that HelloResource.java is in a package called `resources`
- copy HelloResource.java to GoodbyeResource.java
- open GoodbyeResource.java in an editor
- change `@Path("/hello")` to `@Path("/goodbye")`
- replace 'public class HelloResource' with 'public class GoodbyeResource'
- replace 'public HelloResource' with 'public GoodbyeResource'
- find the line that calls `setText`
- change `"Hello "` to `"Goodbye "`
- open `HelloWorldApplication.java` in an editor
- find the `run` method
- add a line of code that registers the GoodbyeResource
