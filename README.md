# dropwizard-helloworld


"Hello world" application -- [Dropwizard](https://dropwizard.io) version 2.x


# Java runtime
This project requires `Java 8` or higher


# Build

```
$ mvn clean package
```

# Run the application

```
$ java -jar target/app.jar server config/dev_config.yml
```

# Service endpoint

open a web browser and visit this URL:

http://localhost:8080/hello?name=Jeff
