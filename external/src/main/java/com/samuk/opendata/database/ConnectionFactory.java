package com.samuk.opendata.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	private static Connection conn = null;
	private static final String url = "jdbc:mysql://localhost:3306/parkkimittarit";
	private static final String user = "sauli";
	private static final String password = "samuk";
	
	public static Connection getConnection(){
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
