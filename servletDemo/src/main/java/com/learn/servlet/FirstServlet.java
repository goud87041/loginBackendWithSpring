package com.learn.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("in First servlet controller ");

        RequestDispatcher dis = request.getRequestDispatcher("/secondServlet");
        dis.forward(request, response);

        
        
        // out.close();

    }
}
