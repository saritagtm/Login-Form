package com.example.loginform;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String Username = request.getParameter("UserName");
        String password = request.getParameter("Password");
        PrintWriter writer = response.getWriter();
        System.out.println("Username is "  + Username +  "Password is "  + password);
        writer.println("Hello"  +Username);

       // Cookie cookie = new Cookie("cookieName", Username);
        //response.addCookie(cookie);

        writer.println("<form action='cookieTest' method ='POST'>");
        writer.println("<input type ='hidden' name='UserName' value ='" +Username + "'/>");
        writer.println("<input type ='submit' value ='Next'/>");

        writer.println("</form>");
    }






        public void destroy() {
    }
}