package com.learn.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {

    public FirstServlet() {
        System.out.println("object is created in servlet container");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("uname");
        String city = req.getParameter("ucity");
        PrintWriter out = resp.getWriter();

        out.println("your name is " + name);
        out.println("your city is " + city);

        out.close();

    }
}
