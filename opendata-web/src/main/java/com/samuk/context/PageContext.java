package com.samuk.context;

import java.io.Serializable;
import java.net.HttpRetryException;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import com.samuk.PropertyLoader;
import com.samuk.opendata.DB.query.DB;
import com.samuk.opendata.objectModels.ParkMeter;

public class PageContext implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PropertyLoader pl = new PropertyLoader();
	public Properties prop = new Properties();
	public ParkMeter parkMeter;
	
	
	public PageContext(){
		this.prop =  pl.getProperties("page_text.properties");
	}
	
	public PageContext getPageContext(int att) {
		/*
		 * Do something with request (attributes etc)
		 */
		
		try {
			this.parkMeter = new DB().getParkMeter(att);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this;
	}

}
