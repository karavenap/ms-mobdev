package com.mobdev.dto.mapperClientLocation;

import java.util.ArrayList;
import java.util.List;

import com.mobdev.dto.mapperClientCharacter.EpisodeCharacter;

public class LocationRS {
	
	private int id;
	private String name;
	private String type;
	private String dimension;
	private List<ResidentsLocation> residents = new  ArrayList<ResidentsLocation>();;
	private String url;
	private String created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public List<ResidentsLocation> getResidents() {
		return residents;
	}
	public void setResidents(List<ResidentsLocation> residents) {
		this.residents = residents;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + ", type=" + type + ", dimension=" + dimension + ", residents="
				+ residents + ", url=" + url + ", created=" + created + "]";
	}
	
	
	
}
