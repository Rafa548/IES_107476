package ua.ies.lab2;
 
import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
 
public class EmbeddedJettyExample {
 
    public static void main(String[] args) throws Exception {
         
        Server server = new Server(8680);       
         
        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);
                 
        servletHandler.addServletWithMapping(HelloServlet.class, "/");
        //servletHandler.addServletWithMapping(ContextHandler.class, "/context");
         
        server.start();
        server.join();
 
    }
     
    public static class HelloServlet extends HttpServlet 
    {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            if (request.getParameter("msg") != null) {
                response.setContentType("text/html");
                response.setStatus(HttpServletResponse.SC_OK);
                response.getWriter().println(request.getParameter("msg") ) ; 
            } else {
                response.setContentType("text/html");
                response.setStatus(HttpServletResponse.SC_OK);
                response.getWriter().println("<h1>New Hello Simple Servlet</h1>"); 
            }
        }
      }
 }