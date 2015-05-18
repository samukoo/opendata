package com.samuk.opendata.external_data_test;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import com.samuk.opendata.external_data.OpendataSource;
import com.samuk.opendata.objectModels.ParkMeter;

public class OpendataSourceTest {

	OpendataSource test = new OpendataSource();
	
//	@Test
	public void createParkmeterListObject() throws IOException{
		
		List<ParkMeter> result = null;
		
		result = test.getParkMeterList();
		
		assertNotNull(result);
		for(ParkMeter pm:result){
			System.out.print(pm.getTunniste()+" ");
			System.out.print(pm.getOsoite()+" ");
			System.out.print(pm.getZone()+" ");
			System.out.print(pm.getMaksullisuus()+" ");
			System.out.print(pm.getStopTime()+" ");
			System.out.print(pm.getMuu_maksutapa() +" ");
			System.out.print(pm.getPaikka_x()+" ");
			System.out.println(pm.getPaikka_y());
		}
	}
	
//	@Test
	public void removeNull() throws IOException{
		test.removeNullData();
	}
}
