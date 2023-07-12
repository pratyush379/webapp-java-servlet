package com.pratyush;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req , HttpServletResponse res)
	throws ServletException , IOException{
		
/*	PrintWriter writer = res.getWriter();
		writer.println("hello bhai");
		writer.println("hello bhai 2");*/
		
//System.out.println(req.getParameter("name"));
		
		//String name = req.getParameter("name");
		
		//req.setAttribute("name1", name);
		
		req.getRequestDispatcher("/WEB-INF/views/login2.jsp").forward(req,res);
	}
	
	
	protected void doPost(HttpServletRequest req , HttpServletResponse res)
			throws ServletException , IOException{
		String name = req.getParameter("name");
		String pass = req.getParameter("password");
		
		userValidationService uvs = new userValidationService();
		boolean isValid = uvs.isValid(name, pass);
		if(isValid) {
		req.setAttribute("name1", req.getParameter("name"));
		req.setAttribute("name2", req.getParameter("password"));
		req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req,res);
		}
		else {
			req.setAttribute("errorMeassage", "invalid credential");
			req.getRequestDispatcher("/WEB-INF/views/login2.jsp").forward(req,res);
		}
		
			}

	
	
}
