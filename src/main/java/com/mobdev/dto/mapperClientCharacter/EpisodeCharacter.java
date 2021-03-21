package com.mobdev.dto.mapperClientCharacter;

public class EpisodeCharacter {
	
	
	
	public EpisodeCharacter() {
		super();
	}

	public EpisodeCharacter(String url) {
		super();
		this.url = url;
	}

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "EpisodeCharacter [url=" + url + "]";
	}
	
	

}
