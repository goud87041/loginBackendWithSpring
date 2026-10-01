package com.learn.servlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

import java.io.PrintWriter;

// import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/secondServlet")
public class SecondServlet extends  HttpServlet{

    public void doPost(HttpServletRequest request ,HttpServletResponse response) throws  ServletException ,IOException{
       
        try {
            PrintWriter writer = response.getWriter();
            writer.println("<h1>this is second servlet </h1>");            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e );
        }
        // String name = request.getParameter("uname");
    }
}
