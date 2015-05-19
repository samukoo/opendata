package com.samuk.rest.v1;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.samuk.opendata.DB.query.DB;
import com.samuk.opendata.objectModels.ParkMeter;

/**
 * 
 * @author kotissa
 *
 */

@Path("parkmeter/v1")
public class Rest{

	@GET
	@Path("test")
	@Produces(MediaType.APPLICATION_JSON)
	public String test(){
		return "test";
	}
	
	@GET
	@Path("listall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ParkMeter> daa() throws SQLException{
		return new DB().getParkMeters();
	}
	
	@Path("address")
	@GET
	public String address(@QueryParam("name") String name){
		return "hello " + name;
	}
	
}
