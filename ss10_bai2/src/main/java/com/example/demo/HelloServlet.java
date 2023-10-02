package com.example.demo;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "hello", value = "/calculator-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       double num1 = Double.parseDouble(request.getParameter("a"));
       double num2 = Double.parseDouble(request.getParameter("b"));
       String n = request.getParameter("ope");
       double result = 0.0;
       switch (n) {
           case "+":
               result = num1+num2;
               break;
           case "-":
               result = num1-num2;
               break;
           case "*":
               result = num1*num2;
               break;
           case "/":
               result = num1/num2;
               break;
           default:
               break;
       }
       request.setAttribute("result",result);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}