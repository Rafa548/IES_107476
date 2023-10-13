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
        if(username == null) throw new NullPointerException("You didn't provide an username!");
        //String password = request.getParameter("password");
        try {
            switch (username.toLowerCase()) {
                case "user":
                    out.println("OMG");
                    break;
                case " ":
                    out.println(":)");
                    break;
                default:
                    out.println("Desconhecido??");
            }
            out.print("</h2>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

}