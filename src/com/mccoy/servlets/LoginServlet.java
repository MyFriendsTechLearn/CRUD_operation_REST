package com.mccoy.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int uid;
		
		 String str=request.getParameter("uid");
		 if(str== null ||str== ""){
			 uid=0;
			
		 }else{
			 uid = Integer.parseInt(str);
		 }
		
		String password = request.getParameter("password");

		int uid1=0 ;
		String password1 = "";

		JdbcOperations jop = new JdbcOperations();
		jop.setUid(uid);
		jop.setPassword(password);

		if (jop.validation1()) {

			JdbcConnection jdbc = new JdbcConnection();
			Connection con = jdbc.getConnection();
			String sql = "select userid,password from userregistration where userid="+ uid;
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {
					uid1 = rs.getInt(1);
					password1 = rs.getString(2);
				}
				System.out.println("username, password retieved successfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
			
			if (password.equals(password1) && uid==uid1) {

				RequestDispatcher rd = request
						.getRequestDispatcher("Operation.jsp");
				rd.include(request, response);
			} else {
				pw.print("<center><h4><b>User Name and Password wrong</b><h4></center>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);   
			   } 
		
		} else{
		       pw.print("<center><h4><b>Enter User Name And Password</b><h4></center>"); 
		       RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		       rd.include(request, response);
		  
		  }
		}

	}

