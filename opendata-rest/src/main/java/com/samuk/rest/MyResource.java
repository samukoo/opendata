package com.samuk.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 */
@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Track getIt() {
        Track track = new Track();
        
        track.setAlbum("One");
        track.setTrack("Nothing else matters");
    	
    	return track;
    }
}
