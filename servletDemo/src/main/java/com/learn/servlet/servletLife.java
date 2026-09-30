package com.learn.servlet;



import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;


@WebServlet("/servletLife")
public class servletLife extends HttpServlet {

    static{
        System.out.println("static block is called");
    }

    public servletLife(){
        System.out.println("object is created ");
    }

    public void init(){
        System.out.println("init method is called");
    }

    public void service(HttpServletRequest req , HttpServletResponse resp){
        System.out.println("service method is called");
    }

    public void destroy(){

    }
} 
