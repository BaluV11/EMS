package com.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url  = "jdbc:mysql://localhost:3306/ems";
		String username = "root";
		String password = "252411";
		
		Connection connection = null;
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			connection.setAutoCommit(false);
		}
		catch(SQLException e) {
			System.out.println(e);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return connection;
	}
}
