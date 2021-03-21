package com.mobdev.dto.mapperClientLocation;

public class ResidentsLocation {

	private String urlResidents;
	
	
	public ResidentsLocation(){
		super();
	}
	public ResidentsLocation(String urlResidents) {
		super();
		this.urlResidents = urlResidents;
	}

	
	public String getUrlResidents() {
		return urlResidents;
	}

	public void setUrlResidents(String urlResidents) {
		this.urlResidents = urlResidents;
	}

	@Override
	public String toString() {
		return "ResidentsLocation [urlResidents=" + urlResidents + "]";
	}

	
	
	
}
