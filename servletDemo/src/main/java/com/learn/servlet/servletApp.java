package com.learn.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/servletApp")
public class servletApp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet is called ");

        String name = req.getParameter("uname");
        String city = req.getParameter("ucity");

        if (name != null && !name.isEmpty() && city != null && !city.isEmpty()) {
            System.out.println("validation pass");
        } else {
            System.out.println("validation failed");
        }
    }
}
