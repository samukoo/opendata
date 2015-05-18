package com.samuk.opendata.objectModels;

/**
 * park meter object class
 * describes park meter
 * @author kotissa
 *
 */
public class ParkMeter {

	int tunniste;
	String osoite = null;
	int zone;
	String maksullisuus = "voivittu";
	String stopTime = null;
	String Muu_maksutapa = "";
	Double paikka_x;
	Double paikka_y;
	
	
	public ParkMeter(){
		
	}

	public int getTunniste() {
		return tunniste;
	}

	public void setTunniste(int tunniste) {
		this.tunniste = tunniste;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public String getMaksullisuus() {
		return maksullisuus;
	}

	public void setMaksullisuus(String maksullisuus) {
		this.maksullisuus = maksullisuus;
	}

	public String getStopTime() {
		return stopTime;
	}

	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}

	public String getMuu_maksutapa() {
		return Muu_maksutapa;
	}

	public void setMuu_maksutapa(String muu_maksutapa) {
		Muu_maksutapa = muu_maksutapa;
	}

	public Double getPaikka_x() {
		return paikka_x;
	}

	public void setPaikka_x(Double paikka_x) {
		this.paikka_x = paikka_x;
	}

	public Double getPaikka_y() {
		return paikka_y;
	}

	public void setPaikka_y(Double paikka_y) {
		this.paikka_y = paikka_y;
	}
	
	
	
	
}
