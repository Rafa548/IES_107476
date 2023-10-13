# Lab 2.1 Notes

## Project Setup

1. Create a new Maven project following the instructions provided in the guide [here](https://examples.javacodegeeks.com/java-development/enterprise-java/jetty/embedded-jetty-server-example/).

## Steps in the Guide

### 3.1 Maven Project Creation

### 3.2 Dependencies Added

### 3.3 Class Creation/Modification

In this step, create the skeleton of the server without implementing any functionality.

### 3.4 Skipped

This step can be skipped as instructed in the guide.

### 3.5 Hello Servlet Added

- Create a new servlet and make it a handler for the server.

```java
ServletHandler servletHandler = new ServletHandler();
server.setHandler(servletHandler);
servletHandler.addServletWithMapping(HelloServlet.class, "/");
```

Implement the HelloServlet class to handle requests and load an HTML page with a given message.

```java
public static class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>New Hello Simple Servlet</h1>");
    }
}
```

### Testing the Servlet

To test the servlet, open your web browser and access the following URLs:

- [http://127.0.0.1:8680/](http://127.0.0.1:8680/)
- [http://127.0.0.1:8680/?msg=%22Hard%20workers%20welcome!%22](http://127.0.0.1:8680/?msg=%22Hard%20workers%20welcome!%22)
