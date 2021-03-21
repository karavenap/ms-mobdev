package com.mobdev.dto.mapperClientCharacter;

import java.util.ArrayList;
import java.util.List;

public class CharacterRS {
	
	private int id;
	private String name;
	private String status;
	private String species;
	private String type;
	private String gender;
	private OrigenCharacter origin;
	private LocationCharacter location;
	private String image;
	private List<EpisodeCharacter> episode = new ArrayList<EpisodeCharacter>();
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public OrigenCharacter getOrigin() {
		return origin;
	}
	public void setOrigin(OrigenCharacter origin) {
		this.origin = origin;
	}
	
	public LocationCharacter getLocation() {
		return location;
	}
	public void setLocation(LocationCharacter location) {
		this.location = location;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<EpisodeCharacter> getEpisode() {
		return episode;
	}
	public void setEpisode(List<EpisodeCharacter> episode) {
		this.episode = episode;
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
		return "Character [id=" + id + ", name=" + name + ", status=" + status + ", species=" + species + ", type="
				+ type + ", gender=" + gender + ", origin=" + origin + ", location=" + location + ", image=" + image
				+ ", episode=" + episode + ", url=" + url + ", created=" + created + "]";
	}
	
	
	
}
