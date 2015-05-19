package com.samuk.opendata.DB.factory;

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
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
