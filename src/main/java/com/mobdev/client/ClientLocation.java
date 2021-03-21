package com.mobdev.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mobdev.dto.mapperClientLocation.LocationRS;

@Service
public class ClientLocation {

	public LocationRS consumeCustomeLocationRestTemplate(String id) {
		
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://rickandmortyapi.com/api/location/";
		LocationRS location = restTemplate.getForEntity(fooResourceUrl + id, LocationRS.class).getBody(); 
		return location;
	}
}
