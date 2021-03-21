package com.mobdev.dto.mapperClientCharacter;

public class LocationCharacter {
	
	private String name;
	private String url;
	
	
	
	public LocationCharacter() {
		super();
	}
	public LocationCharacter(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "LocationCharacter [name=" + name + ", url=" + url + "]";
	}
	
	

}
