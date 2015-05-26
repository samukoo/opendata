package com.samuk.context;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.samuk.PropertyLoader;
import com.samuk.opendata.DB.query.DB;
import com.samuk.opendata.objectModels.Likes;
import com.samuk.opendata.objectModels.ParkMeter;

public class PageContext implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PropertyLoader pl = new PropertyLoader();
	private Properties prop = new Properties();
	private ParkMeter parkMeter;
	private List<ParkMeter> parkMeters = new ArrayList<ParkMeter>();
	
	private Likes likes;
	
	public PageContext(){
		this.prop =  pl.getProperties("page_text.properties");
	}
	
	public PageContext getParkmeterPageContext(int att) {
		/*
		 * Do something with request (attributes etc.)
		 */
		
		try {
			this.parkMeter = new DB().getParkMeter(att);
			this.likes = new DB().getLikes(att);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this;
	}

	public PageContext getMainPageContext() {
		try {
			this.parkMeters = new DB().getParkMeters();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public List<ParkMeter> getSearchResult(String osoite) {
		try {
			this.parkMeters = new DB().getParkMetersFromAddress(osoite);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return parkMeters;
	}
	
	public PropertyLoader getPl() {
		return pl;
	}

	public Properties getProp() {
		return prop;
	}

	public ParkMeter getParkMeter() {
		return parkMeter;
	}

	public Likes getLikes() {
		return likes;
	}

	

	public List<ParkMeter> getParkMeters() {
		return parkMeters;
	}

	
	
	
	
	
}
