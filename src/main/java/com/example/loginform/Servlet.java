package com.example.loginform;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/cookieTest")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String uName = request.getParameter("UserName");
        printWriter.println("welcome" +uName );
       /* Cookie cookie[] = request.getCookies();
        if (cookie != null) {
            for (int i =0; i < cookie.length; i++){
                String name = cookie[i].getValue();
                printWriter.println("Hello" +name);
            }
        }

           // printWriter.println("Hello" +cookie[0].getName());
       printWriter.close();*/

    }
}
