package com.mccoy.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JdbcOperations {

	private int uid;
	private String uname;
	private String password;
	private String bday;
	private String gender;
	private String myselect;

	// Setters and getters

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMyselect() {
		return myselect;
	}

	public void setMyselect(String myselect) {
		this.myselect = myselect;
	}

	// Operation methods

	public void insertRecord(UserBeans ub) {

		JdbcConnection jdbc = new JdbcConnection();
		Connection con = jdbc.getConnection();
		String sql = "insert into userregistration values(?,?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(1, ub.getUid());
			pst.setString(2, ub.getUname());
			pst.setString(3, ub.getPassword());
			pst.setString(4, ub.getBday());
			pst.setString(5, ub.getGender());
			pst.setString(6, ub.getMyselect());

			pst.execute();

			System.out.println("record inserted successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteRecord() {

	}

	public void retrieveRecord() {

	
	}

	public void updateRecord() {

	}

	public void validationRecord() {

	}

	boolean found = false;

	public boolean validation() {

		if (uid == 0) {
			found = false;
			return found;
		}

		else if (uname.equals(null) || uname == "") {
			found = false;
			return found;
		} else if (password.equals(null) || password == "") {
			found = false;
			return found;
		}

		else if (bday.equals(null) || bday == "") {
			found = false;
			return found;
		} else if (gender.equals(null) || gender == "") {
			found = false;
			return found;
		} else if (myselect.equals(null) || myselect == "") {
			found = false;
			return found;
		}

		return true;
	}

	public boolean validation1() {

		if (uid==0) {
			found = false;
			return found;
		}
		else if (password.equals(null) || password == "") {
			found = false;
			return found;
		}
		
		return true;
	}
}
