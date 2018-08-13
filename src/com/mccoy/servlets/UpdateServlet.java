package com.mccoy.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int uid = Integer.parseInt(request.getParameter("uid"));
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		JdbcConnection jdbc = new JdbcConnection();
		Connection con = jdbc.getConnection();
		String sql = "update userregistration set uname=?,password=?  where userid="+uid;
		try{
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,request.getParameter("uname") );
		pst.setString(2, request.getParameter("password"));
	    int i=pst.executeUpdate();
	    System.out.println("Record updated successfull");
		}catch(SQLException e){
			e.printStackTrace();
		}

		pw.print("<b>Record Updatedfull</b>");
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		rd.include(request, response);
	}

	

}
