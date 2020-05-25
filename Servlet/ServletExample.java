package com.company;

import java.io.IOException;
import java.io.PrintWriter;

//import java.servlet.*;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException {
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("name");
		String passw = request.getParameter("pass");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1> Welcome " + username + "</h1>");
		pw.println("<h3> Your email is: " + email + "</h3>");
		pw.println("<h3> and your phone number is " + phone + "</h1>");
		pw.println("</body>");
		pw.println("</html>");
		
		
		
	}

}
