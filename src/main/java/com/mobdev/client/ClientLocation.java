package com.mobdev.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mobdev.model.location.LocationResponse;

@Service
public class ClientLocation {

	@Value("${url.rickandmorty.location}")
	private String uriLocation;

	/**
	 * Este metodo es el cliente creado para consumir el servicio de Location de Rick and Morty
	 * pasandole por parametro el id del personaje usando RestTemplate
	 * Metodo RestTemplate
	 * @String id es el id de un personaje de Rick y Morty
	 * @return restTemplate
	 */
	public LocationResponse locationRestTemplate(String id) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity(uriLocation.concat(id), LocationResponse.class).getBody();
	}
}