package ies.jakartawebstarter;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean success = validateUser(username, password);
        try {
            // Write some content
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            if(success) {
                out.println("<h2>Welcome Friend</h2>");
            }else{
                out.println("<h2>Validate your self again.</h2>");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
    public boolean validateUser(String us,String pass){
        return true;
    }
}