package com.mccoy.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		JdbcOperations jop = new JdbcOperations();
		// validation process
		int uid = Integer.parseInt(request.getParameter("uid"));
		jop.setUid(uid);
		jop.setUname(request.getParameter("uname"));
		jop.setPassword(request.getParameter("password"));
		jop.setBday(request.getParameter("bday"));
		jop.setGender(request.getParameter("gender"));
		jop.setMyselect(request.getParameter("myselect"));

		if (jop.validation()) {
			UserBeans ub = new UserBeans();
			ub.setUid(uid);
			ub.setUname(request.getParameter("uname"));
			ub.setPassword(request.getParameter("password"));
			ub.setBday(request.getParameter("bday"));
			ub.setGender(request.getParameter("gender"));
			ub.setMyselect(request.getParameter("myselect"));

			jop.insertRecord(ub);
			pw.print("<center><h4>Record Inserted Successfully<h4></center>");

			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}

		else {

			pw.print("   <center><h3 font-color='red'>Please Enter All fields Properly</h3></center>");
			RequestDispatcher rd = request
					.getRequestDispatcher("Registration.jsp");
			rd.include(request, response);
		}

	}

}
