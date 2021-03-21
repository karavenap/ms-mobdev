package com.mobdev.dto;

import java.util.List;

public class Origin {
	
	private String name;
	private String url;
	private String dimension;
	private List<Residents> residents;
	
	
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
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public List<Residents> getResidents() {
		return residents;
	}
	public void setResidents(List<Residents> residents) {
		this.residents = residents;
	}
	@Override
	public String toString() {
		return "Origin [name=" + name + ", url=" + url + ", dimension=" + dimension + ", residents=" + residents + "]";
	}
	
	
	
}
