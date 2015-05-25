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
	String stoptime = null;
	String muumaksutapa = "";
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
		return stoptime;
	}

	public void setStopTime(String stopTime) {
		this.stoptime = stopTime;
	}

	public String getMuu_maksutapa() {
		return muumaksutapa;
	}

	public void setMuumaksutapa(String muumaksutapa) {
		this.muumaksutapa = muumaksutapa;
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
