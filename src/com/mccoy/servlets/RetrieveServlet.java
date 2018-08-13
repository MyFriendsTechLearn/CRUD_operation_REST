package com.mccoy.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		JdbcConnection jdbc = new JdbcConnection();
		Connection con = jdbc.getConnection();
		String sql = "select * from userregistration";
		try{
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		 
	     pw.println("<h2 align=\"center\">Profile Infomation</h2><table border=1 align=center width=50% height=10%>");
	     pw.println("<tr>");
		while(rs.next()){
			pw.print(rs.getInt(1));
			pw.print("<br>");
			pw.print(rs.getString(2));
			pw.print("<br>");
			pw.print(rs.getString(3));
			pw.print("<br>");
			pw.print(rs.getString(4));
			pw.print("<br>");
			pw.print(rs.getString(5));
			pw.print("<br>");
			pw.print(rs.getString(6));
			pw.print("<br>");
			pw.print("------------------------------------");
			
		}
		System.out.println("Record retieved successfully");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		pw.print("<a href='welcome.jsp'>Goto Home page</a>");
	}

	

}
