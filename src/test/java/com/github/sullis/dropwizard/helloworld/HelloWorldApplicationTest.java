
package com.github.sullis.dropwizard.helloworld;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import static io.restassured.RestAssured.given;

@ExtendWith(DropwizardExtensionsSupport.class)
public class HelloWorldApplicationTest {

  private static final DropwizardAppExtension<HelloWorldConfiguration> EXT = new DropwizardAppExtension<>(
          HelloWorldApplication.class,
          ResourceHelpers.resourceFilePath("test_config.yml")
  );

  @Test
  public void happyPath() throws Exception {
    given()
      .request()
      .get("http://localhost:" + EXT.getLocalPort() + "/helloworld?name=Obama")
    .then()
        .assertThat()
        .statusCode(200)
        .contentType("application/json")
        .body(containsString("Hello Obama"));
  }
}
