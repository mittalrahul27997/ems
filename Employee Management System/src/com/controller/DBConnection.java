package com.controller;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Driver d=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "rahul@123");
		}catch (Exception e) {
			throw new RuntimeException("Error in connecting to the database", e);
		}
		
		return con;
	}

}
