package integrationTests;

import org.junit.Test;

import com.samuk.opendata.database.DB;
import com.samuk.opendata.external_data.OpendataSource;
import com.samuk.opendata.objectModels.ParkMeter;

public class writeDataIT {
	
	@Test
	public void writeDataToDB() throws Exception{
		
		DB db = new DB();
		OpendataSource ods = new OpendataSource();
		
		for(ParkMeter pm : ods.getParkMeterList()){
			db.insertData(pm);
		}
		System.out.println("SQL insert done");
		
	}
	
	
}
