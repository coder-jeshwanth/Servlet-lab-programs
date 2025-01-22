package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/marks")
public class MarksHandling extends HttpServlet{
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	PrintWriter out = resp.getWriter();
	
	try{
	
	String name = req.getParameter("name");
	int sub1 = Integer.parseInt(req.getParameter("sub1"));
	int sub2 = Integer.parseInt(req.getParameter("sub2"));
	int sub3 = Integer.parseInt(req.getParameter("sub3"));
	int sub4 = Integer.parseInt(req.getParameter("sub4"));
	int sub5 = Integer.parseInt(req.getParameter("sub5"));
	int sub6 = Integer.parseInt(req.getParameter("sub6"));
	
	int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
	float percentage = totalMarks/6;
	
	out.println("<table border='3'>"
			+ "<tr>"
			+ "<th>Subject name</th>"
			+ "<th>Marks</th>"
			+ "</tr>"
			
			+ "<tr>"
			+ "<td>English</td>"
			+ "<td>"+sub1+"</td>"
			+ "</tr>"
			
			+ "<tr>"
			+ "<td>Kananda</td>"
			+ "<td>"+sub2+"</td>"
			+ "</tr>"
			
			+ "<tr>"
			+ "<td>Maths</td>"
			+ "<td>"+sub3+"</td>"
			+ "</tr>"

			+ "<tr>"
			+ "<td>Social</td>"
			+ "<td>"+sub4+"</td>"
			+ "</tr>"

			+ "<tr>"
			+ "<td>Science</td>"
			+ "<td>"+sub5+"</td>"
			+ "</tr>"

			+ "<tr>"
			+ "<td>Computer science</td>"
			+ "<td>"+sub6+"</td>"
			+ "</tr>" 
			
			+ "<tr>"
			+ "<td>Total</td>"
			+ "<td>"+totalMarks+"<td>"
			+ "</tr>"
			
			+ "<tr>"
			+ "<td>Percentage</td>"
			+ "<td>"+percentage+"</td>"
			+ "</tr></table>");
	
	
	}catch(Exception e){
		out.println("Number format exception");
	}
	
}

}
