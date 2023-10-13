# Lab 2.1 Notes

Create a new Maven project (in the guide pdf is provided this link --> https://examples.javacodegeeks.com/java-development/enterprise-java/jetty/embedded-jetty-server-example/)
Follow the instructions given in the link
    3.1--> Maven Project creation
    3.2--> Dependencies added
    3.3--> Class creation/modification (Just the skeleton of the server not doing anything)
    3.4--> Skiped as instructed in the guide
    3.5--> Hello Servlet added 
        Created the new servlet, made it a handler for the server, "/" calls the servlet job
        ```
            ServletHandler servletHandler = new ServletHandler();
            server.setHandler(servletHandler);
                    
            servletHandler.addServletWithMapping(HelloServlet.class, "/");
        ```
        
        Hello Servlet class that takes the request and loads a html page with the given message
        ```
            public static class HelloServlet extends HttpServlet 
            {
                protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
                {
                    response.setContentType("text/html");
                    response.setStatus(HttpServletResponse.SC_OK);
                    response.getWriter().println("<h1>New Hello Simple Servlet</h1>"); 
                    } 
            }
        ```

Finnaly open the browser in this page --> http://127.0.0.1:8680/
                                      --> http://127.0.0.1:8680/?msg=%22Hard%20workers%20welcome!%22




