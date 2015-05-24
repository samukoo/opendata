package com.samuk;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class PropertyLoader {

	Properties prop = new Properties();
	InputStream input = null;
	
	public List<MenuObject> getPropAsList() throws IOException{
		
		List<MenuObject> menuList = new ArrayList<MenuObject>();
		
		input = getClass().getClassLoader().getResourceAsStream("menu.properties");
		
		if(input==null){
			System.out.println("not found");
		}
		prop.load(input);
		input.close();
		
		Enumeration<?> e = prop.propertyNames();
		
		while(e.hasMoreElements()){
			
			MenuObject mo = new MenuObject();
			
			String key = (String)e.nextElement();
			
			mo.setNimi(key);
			mo.setOsoite(prop.getProperty(key));
			
			menuList.add(mo);
		}
		return menuList;
	}
	
	public Properties getProperties(String file){
	
		input = getClass().getClassLoader().getResourceAsStream(file);
		Properties prop = new Properties();
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
}
