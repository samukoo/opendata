package com.samuk.opendata.external_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuk.opendata.objectModels.ParkMeter;

/**
 * Class methods 
 * @author kotissa
 *
 */
public class OpendataSource{

	Logger logger = LoggerFactory.getLogger(OpendataSource.class);
	
	HttpURLConnection conn;
	URL url;
	File file;
	List<ParkMeter> parkMeterList;
	
	/**
	 * Class constructor creates List<ParkMeter> -object
	 * @throws IOException
	 */
	public OpendataSource() {
//		getOpenData();
		
		try {
			this.parkMeterList = createParkMeterList(readExcel());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Getter for List object
	 * @return List<ParkMeter>
	 */
	public List<ParkMeter> getParkMeterList() {
		return parkMeterList;
	}

	/**
	 * Takes List<Row> in and transfer the data to List<ParkMeter> -list object
	 * @param List<Row> data
	 * @return List<ParkMeter>
	 */
	private List<ParkMeter> createParkMeterList(List<Row> data){
		List<ParkMeter> parkmeterList = new ArrayList<ParkMeter>();
		logger.info("Transfer to ParkMeter list");
		for(Row row:data){
			if(row.getCell(0).getCellType() == 0){
				ParkMeter pm = new ParkMeter();
					pm.setTunniste((int)row.getCell(0).getNumericCellValue());
					pm.setOsoite(row.getCell(1).getStringCellValue());
					pm.setZone((int)row.getCell(2).getNumericCellValue());
	//				pm.setMaksullisuus(row.getCell(3).toString());
					pm.setStopTime(row.getCell(4).getStringCellValue());
//					pm.setMuu_maksutapa(row.getCell(5).getStringCellValue());
					pm.setPaikka_x(row.getCell(6).getNumericCellValue());
					pm.setPaikka_y(row.getCell(7).getNumericCellValue());
				parkmeterList.add(pm);
			}
		}
		return parkmeterList;
	}
	
	
	/**
	 * Read excel and return List of row objects
	 * @return List<Row>
	 * @throws IOException
	 */
	private List<Row> readExcel() throws IOException{
		
		List<Row> rowList = new ArrayList<Row>();
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("testi.xls").getFile());
		FileInputStream fis = new FileInputStream(file);
		
        Workbook wb = new HSSFWorkbook(fis);
        Sheet sheet1 = wb.cloneSheet(0);

        logger.info("Extract excel");
        for(Row row : sheet1){
        	rowList.add(row);
        }
		fis.close();
		wb.close();
		return rowList;
	}
	
	/**
	 * Download xls from URI and save it to resource folder for use
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	private void getOpenData() {
		try {
			url = new URL("http://www.hel2.fi/tietokeskus/data/helsinki/Liikenne/pys%C3%A4k%C3%B6intilippuautomaatit.xls");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		file = new File("src/resources/testi.xls");
		try {
			FileUtils.copyURLToFile(url, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void removeNullData() throws IOException{
		
		for(Row r:readExcel()){
			for(Cell c:r){
				if(c.equals(null)){
					c.setCellValue("empty");
				}
			}
		}
	}
		
	
	
	
}
