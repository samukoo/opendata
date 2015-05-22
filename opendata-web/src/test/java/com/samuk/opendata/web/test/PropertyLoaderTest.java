package com.samuk.opendata.web.test;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

import com.samuk.PropertyLoader;

public class PropertyLoaderTest {

	PropertyLoader pl = new PropertyLoader();
	
	
	@Test
	public void test() throws IOException{
		
		assertNotNull(pl.getProp());
		
		
		
		
	}
	
	
}
