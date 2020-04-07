package io.devdharek.CoronavirusApplication.Model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class ApiData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String provinceState;
	String countryRegion;
	long lastUpdate;
	float lat;
	float Long;
	int confirmed;
	int recovered;
	int deaths;
	int active;
	String admin2;
	String fips;
	String combinedKey;
	float incidentRate;
	int peopleTested;
	String iso2;
	String iso3;
	
	public ApiData() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceState() {
		return provinceState;
	}

	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public long getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLong() {
		return Long;
	}

	public void setLong(float l) {
		Long = l;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getAdmin2() {
		return admin2;
	}

	public void setAdmin2(String admin2) {
		this.admin2 = admin2;
	}

	public String getFips() {
		return fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getCombinedKey() {
		return combinedKey;
	}

	public void setCombinedKey(String combinedKey) {
		this.combinedKey = combinedKey;
	}

	public float getIncidentRate() {
		return incidentRate;
	}

	public void setIncidentRate(float incidentRate) {
		this.incidentRate = incidentRate;
	}

	public int getPeopleTested() {
		return peopleTested;
	}

	public void setPeopleTested(int peopleTested) {
		this.peopleTested = peopleTested;
	}

	public String getIso2() {
		return iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

}
