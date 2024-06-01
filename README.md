# dropwizard-helloworld


"Hello world" application -- [Dropwizard](https://dropwizard.io) version 4.x


# Java runtime
This project requires `Java 7` or higher


# Build

```
mvn clean package
```

# Run the application

```
java -jar target/app.jar server config/dev_config.yml
```

# "hello" endpoint

in your web browser, visit this URL:

http://localhost:8080/hello?name=Jeff
