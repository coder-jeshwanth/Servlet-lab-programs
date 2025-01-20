package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/baro")
public class Testing extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name,course,qual,college;
		
		name = req.getParameter("name");
		course = req.getParameter("course");
		qual = req.getParameter("qual");
		college = req.getParameter("college");
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Get Method</h1>" + "<br>");
		out.println("name = "+ name + "<br>");
		out.println("course = "+ course+ "<br>");
		out.println("Qualification = "+ qual+ "<br>");
		out.println("college = "+ college+ "<br>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name,course,qual,college;
		
		name = req.getParameter("name");
		course = req.getParameter("course");
		qual = req.getParameter("qual");
		college = req.getParameter("college");
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Post Method</h1>" + "<br>");
		out.println("name = "+ name + "<br>");
		out.println("course = "+ course+ "<br>");
		out.println("Qualification = "+ qual+ "<br>");
		out.println("college = "+ college+ "<br>");
	}

}
