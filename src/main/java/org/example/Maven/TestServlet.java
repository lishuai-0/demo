package org.example.Maven;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

@WebServlet(urlPatterns = "/login")

public class TestServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String username = (String)req.getParameter("username");
        String password = (String)req.getParameter("password");
        System.out.println(username+"---"+password);
        if (username!=null&&password!=null){
            if (username.equals("ls")&&password.equals("123")) {
                session.setAttribute("username", req.getParameter("username"));
                session.setAttribute("password", req.getParameter("password"));
                resp.sendRedirect("main.jsp");
            }
        }
    }
}


