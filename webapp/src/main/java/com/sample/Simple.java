package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Simple extends HttpServlet {

   private static final long serialVersionUID = 1L; 

   public void doGet(HttpServletRequest request, HttpServletResponse response)  
      throws ServletException, IOException { 
	   System.out.println("Hello World!");
      response.setContentType("text/html");   
      PrintWriter out = response.getWriter();   
      out.print("<html><body>");   
      out.print("<h3>Hello Servlet2</h3>");   
      out.print("</body></html>");         
   }   
}
