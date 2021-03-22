package com.mobdev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobdev.client.ClientCharacter;
import com.mobdev.client.ClientLocation;
import com.mobdev.model.RickyAndMortyRequest;
import com.mobdev.model.RickyAndMortyResponse;
import com.mobdev.model.character.CharacterResponse;
import com.mobdev.model.character.EpisodeCharacter;
import com.mobdev.model.character.OrigenCharacter;
import com.mobdev.model.location.LocationResponse;
import com.mobdev.model.location.ResidentsLocation;
import com.mobdev.model.Origin;
import com.mobdev.model.Residents;

@Service
public class RickyAndMortyServiceImpl implements RickyAndMortyService {
	@Autowired
	private ClientCharacter clientCharacter;

	@Autowired
	private ClientLocation clientLocation;

	/**
	 * Este metodo envia la solicitud del servicio para consultar
	 * a traves de un parametro id la informacion del Personaje de rick and Morty
	 * devolviendo el mapper con la informacion segun el id consultado
	 * Metodo request
	 * @param @object. El id de un personaje de Rick y Morty
	 * @return mapperRickyAndMorty
	 */
	@Override
	public RickyAndMortyResponse request(RickyAndMortyRequest id) throws Exception {
		CharacterResponse characterResponse = clientCharacter.characterRestTemplate(id.getId());
		LocationResponse locationResponse = clientLocation.locationRestTemplate(id.getId());
		return mapperRickyAndMorty( characterResponse, locationResponse);

	}

	private RickyAndMortyResponse mapperRickyAndMorty(  CharacterResponse characterResponse, LocationResponse locationResponse) {
		return RickyAndMortyResponse.
				builder().
				id(locationResponse.getId()).
				name(characterResponse.getName()).
				status(characterResponse.getStatus()).
				species(characterResponse.getSpecies()).
				type(characterResponse.getType()).
				episode_count(String.valueOf(characterResponse.getEpisode().size())).
				origin(Origin.builder().
						name(characterResponse.getOrigin().getName()).
						url(characterResponse.getOrigin().getUrl()).
						dimension(locationResponse.getDimension()).
						residents(mapperResidents(locationResponse)).
						build()).
				build();
	}
	private List<Residents> mapperResidents(LocationResponse locationResponse) {
		List<Residents> residentsList = new ArrayList<Residents>();
		locationResponse.getResidents().forEach(resident -> {
			residentsList.add(Residents.builder().urlResidents(resident.getUrlResidents()).build());
		});
		return residentsList;
	}
}
