# Lab 2.3 Notes

## Spring Boot: A Quick Overview

Spring Boot is a robust application development platform designed to streamline the development process by providing opinionated defaults. 
This approach allows developers to start with minimal effort and create standalone, production-ready applications. 
Spring Boot prioritizes convention over configuration, making it an excellent choice for many applications.

## Spring Initializr: Simplifying Dependency Management

Spring Initializr templates include a curated set of transitive dependencies necessary to kickstart specific functionalities. 
These templates significantly simplify the setup of the Project Object Model (POM) for your project.

## Customizing the Application Port

To change or add a port setting for your Spring Boot application, navigate to the `src/main/resources/application.properties` file and modify the following line:

```properties
server.port=8080  # Default port
```

Web Controllers: Handling HTTP Requests

In Spring's web development approach, HTTP requests are managed by controllers. These controllers handle the incoming requests and execute appropriate actions in your application.

##Running the Project

To run your Spring Boot project, use the following command:

```bash
./mvnw spring-boot:run
```
