package com.learn.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/successregister")
public class successRegister extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("uname");
        String city = req.getParameter("ucity");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Success</title></head><body>");
        out.println("<h1>Your name is: " + name + "</h1>");
        out.println("<h1>Your city is: " + city + "</h1>");
        out.println("</body></html>");
    }
}
