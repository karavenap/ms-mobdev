package com.mobdev.dto;

import java.util.List;

public class CharacterLocationRS {
	
	private int id;
	private String name;
	private String status;
	private String species;
	private String type;
	private String episode_count;
	private Origin origin = new Origin();
	
	
	
	public CharacterLocationRS() {
		super();
	}
	public CharacterLocationRS(int id, String name, String status, String species, String type, String episode_count,
			Origin origin) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.type = type;
		this.episode_count = episode_count;
		this.origin = origin;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEpisode_count() {
		return episode_count;
	}
	public void setEpisode_count(String episode_count) {
		this.episode_count = episode_count;
	}
	public Origin getOrigin() {
		return origin;
	}
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "CharacterLocationRS [id=" + id + ", name=" + name + ", status=" + status + ", species=" + species
				+ ", type=" + type + ", episode_count=" + episode_count + ", origin=" + origin + "]";
	}
	
	

	

}
