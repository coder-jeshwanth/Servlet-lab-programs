package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Nanu")
public class Authentication extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {
		
		System.out.println("Connected");
	    
	    // Get parameters
	    String name = req.getParameter("name");
	    String password = req.getParameter("pass");

	    // Get the PrintWriter
	    PrintWriter out = resp.getWriter();
	    
	    // Check for correct login
	    if (name.equals("jeshy") && password.equals("12345")) {
	        out.print("<h1> Welcome to Computer Science Department </h1>");
	        resp.setStatus(HttpServletResponse.SC_OK);
	        out.print("Status code 200");
	    } else {
	        out.print("Client request incomplete, status code 404");
	        resp.sendError(HttpServletResponse.SC_NOT_FOUND);
	    }
	}


	

}
