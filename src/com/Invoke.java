package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Invoke extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().append("Servered at: ").append(req.getContextPath());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
			System.out.println("Servlet Executed");
			String param;
			resp.setContentType("application/octet-stream");
			param=req.getParameter("param1");
			System.out.println(param);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}

