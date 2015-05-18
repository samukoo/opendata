package com.samuk.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.samuk.opendata.objectModels.ParkMeter;


/**
 */
@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ParkMeter> getIt() {
    	
    	ParkMeter pm1 = new ParkMeter();
    	ParkMeter pm2 = new ParkMeter();
    	List<ParkMeter>pm = new ArrayList<ParkMeter>();
    	pm.add(pm1);
    	pm.add(pm2);
    	
    	
    	
    	
    	return pm;
    }
}
