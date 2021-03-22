package com.mobdev.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class RickyAndMortyResponse {
	
	private int id;
	private String name;
	private String status;
	private String species;
	private String type;
	private String episode_count;
	private Origin origin = new Origin();
	
}
