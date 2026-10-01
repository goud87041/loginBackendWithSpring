package com.learn.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {

    public FirstServlet() {
        System.out.println("object is created in servlet container");
    }

    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");

    RequestDispatcher resDispathcer = request.getRequestDispatcher("/secondServlet");
    String name = request.getParameter("uname");
    String city = request.getParameter("ucity");


    
    HttpSession session = request.getSession();
    session.setAttribute("name", name);
    session.setAttribute("city", city);

    PrintWriter writer = response.getWriter();
    writer.println("<h1>this is first servlet </h1>");


   
    resDispathcer.forward(request , response);

    writer.close();

    




    
}

}
