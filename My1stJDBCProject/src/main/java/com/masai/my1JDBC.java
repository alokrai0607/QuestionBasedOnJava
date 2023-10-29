package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class my1JDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		try {
			Connection con = DriverManager.getConnection(url, "root", "0303");
			Statement st = con.createStatement();
			int row = st.executeUpdate("insert into student values(3,'alok','varanasi','1254425100')");
			if (row > 0) {
				System.out.println("Student detail has inserted..");
			} else {
				System.out.println("Student detail has not inserted..");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
