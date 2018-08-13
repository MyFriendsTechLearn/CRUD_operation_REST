package com.mccoy.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	
	  Connection con;
		
		public Connection getConnection(){
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.12:1521:XE","system","tiger");
				
			System.out.println("jdbc connection succeseeded");
			
			}catch(ClassNotFoundException e){
				e.printStackTrace();
				}catch(SQLException e){
					e.printStackTrace();
				}
			return con;
		}
	}
