package integrationTests;

import org.junit.Test;

import com.samuk.opendata.DB.query.Util;
import com.samuk.opendata.external_data.OpendataSource;
import com.samuk.opendata.objectModels.ParkMeter;

public class writeDataIT {
	
	@Test
	public void writeDataToDB() throws Exception{
		
		Util util = new Util();
		OpendataSource ods = new OpendataSource();
		
		for(ParkMeter pm : ods.getParkMeterList()){
			util.insertData(pm);
		}
		System.out.println("SQL insert done");
		
	}
	
	
}
