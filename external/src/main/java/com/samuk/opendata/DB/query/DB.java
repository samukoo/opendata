package com.samuk.opendata.DB.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samuk.opendata.DB.factory.ConnectionFactory;
import com.samuk.opendata.objectModels.ParkMeter;

public class DB{

	Connection conn = null;
	
	/**
	 * Returns data from Parkkimittarit database
	 * @return List<ParkMeter>
	 * @throws SQLException
	 */
	public List<ParkMeter> getParkMeters() 
			throws SQLException{
	
		conn = ConnectionFactory.getConnection();
		String sql_string = "SELECT * FROM mittari_data";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql_string);
		
		ResultSet rs = pstmt.executeQuery();
		List<ParkMeter> pmList = new ArrayList<ParkMeter>();
		
		while(rs.next()){
			ParkMeter pm = new ParkMeter();
			pm.setTunniste(rs.getInt("Tunniste"));
			pm.setOsoite(rs.getString("Osoite"));
				pmList.add(pm);
		}
		conn.close();
		return pmList;
	}

	public ParkMeter getParkMeter(int tunniste) throws SQLException{
		conn = ConnectionFactory.getConnection();
		String sql_string = "SELECT * FROM mittari_data where Tunniste = ?";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql_string);
		pstmt.setInt(1, tunniste);
		
		ResultSet rs = pstmt.executeQuery();
		ParkMeter pm = new ParkMeter();
		
		while(rs.next()){
			
			pm.setTunniste(rs.getInt("Tunniste"));
			pm.setOsoite(rs.getString("Osoite"));
				
		}
		conn.close();
		return pm;
	}

	
}
