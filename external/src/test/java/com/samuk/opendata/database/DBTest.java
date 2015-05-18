package com.samuk.opendata.database;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.samuk.opendata.objectModels.ParkMeter;

public class DBTest {

	DB db = new DB();
	Connection conn = null;
	
//	@Test
	public void getAllTables()
				 throws SQLException {
		
		if(this.conn!=null){
			this.conn = null;
		}
		
		List<ParkMeter> result = null;
		result = db.getTables();
		
			assertNotNull(result);
			
		for(ParkMeter pm : result){
			System.out.println("Tunniste: " + pm.getTunniste());
			System.out.println("Osoite: " + pm.getOsoite());
		}
	}
	
//	@Test
	public void insertData() 
				 throws SQLException{
		
		ParkMeter data = new ParkMeter();
		
		data.setTunniste(9876);
		data.setOsoite("foobar");
		data.setZone(543);
		
		db.insertData(data);
		
		
	}
	
	
	
}
