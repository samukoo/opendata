package com.samuk.opendata.DB.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.samuk.opendata.DB.factory.ConnectionFactory;
import com.samuk.opendata.objectModels.ParkMeter;

/**
 * DB util class. Home for all those 
 * methods rest calls wont call directly
 * @author kotissa
 *
 */
public class Util {

	Connection conn = null;
	
	/**
	 * Insert data into table. Takes ParkMeter object as an argument 
	 * @param data
	 * @throws SQLException
	 */
	public void insertData(ParkMeter data) throws SQLException{
		String sql_string="INSERT INTO mittari_data "
				+ "(`Tunniste`, `Osoite`, `Zone`, `Maksullisuus`, `stop_time`, `Muu_maksutapa`, `paikka_x`, `paikka_y`) VALUES "
				+ "(?, ?, ?, ?, ?, ?, ?, ?)";
		
		conn = ConnectionFactory.getConnection();
		
			PreparedStatement pstmt = conn.prepareStatement(sql_string);

			pstmt.setInt(1, data.getTunniste());
			pstmt.setString(2, data.getOsoite());
			pstmt.setInt(3, data.getZone());
			pstmt.setString(4, data.getMaksullisuus());
			pstmt.setString(5, data.getStopTime());
			pstmt.setString(6, data.getMuu_maksutapa());
			pstmt.setDouble(7, data.getPaikka_x());
			pstmt.setDouble(8, data.getPaikka_y());
			
			pstmt.execute();
			
			conn.close();
	}	
	
	/**
	 * Util function
	 */
	public void showVersion() throws SQLException {

		String sql_string = "SELECT VERSION()";
		conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql_string);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1));
		}
	}

	/**
	 * Util function
	 */
	public void createTables() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Create connection to database
	 * @return Connection
	 * @throws SQLException
	 */
	@Deprecated
	@SuppressWarnings("unused")
	private Connection testDB() 
			throws SQLException {
		conn = ConnectionFactory.getConnection();
				return conn;
	}
	
	
	
}
