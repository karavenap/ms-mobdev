package com.mobdev.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mobdev.dto.mapperClientCharacter.CharacterRS;

@Service
public class ClientCharacter {
	
	public CharacterRS consumeCustomeCharacterRestTemplate(String id) {
				
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "https://rickandmortyapi.com/api/character/";
		CharacterRS character = restTemplate.getForEntity(fooResourceUrl + id, CharacterRS.class).getBody(); 

				
		return character;
	}

}
