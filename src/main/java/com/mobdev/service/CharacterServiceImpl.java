package com.mobdev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobdev.client.ClientCharacter;
import com.mobdev.client.ClientLocation;
import com.mobdev.dto.CharacterLocationRQ;
import com.mobdev.dto.CharacterLocationRS;
import com.mobdev.dto.Origin;
import com.mobdev.dto.Residents;
import com.mobdev.dto.mapperClientCharacter.CharacterRS;
import com.mobdev.dto.mapperClientCharacter.EpisodeCharacter;
import com.mobdev.dto.mapperClientCharacter.OrigenCharacter;
import com.mobdev.dto.mapperClientLocation.LocationRS;
import com.mobdev.dto.mapperClientLocation.ResidentsLocation;

@Service
public class CharacterServiceImpl implements CharacterService {
	@Autowired
	private ClientCharacter clientCharacter;

	@Autowired
	private ClientLocation clientLocation;

	@Override
	public CharacterLocationRS request(CharacterLocationRQ id) throws Exception {
		CharacterRS objectRespClienteCharacter = clientCharacter.consumeCustomeCharacterRestTemplate(id.getId());
		LocationRS objectRespClienteLocation = clientLocation.consumeCustomeLocationRestTemplate(id.getId());

		return mapper( objectRespClienteCharacter, objectRespClienteLocation);

	}

	private CharacterLocationRS mapper(  CharacterRS objectRespClienteCharacter,
			LocationRS objectRespClienteLocation) {
		CharacterLocationRS response = new CharacterLocationRS();
		response.setId(objectRespClienteLocation.getId());
		response.setName(objectRespClienteCharacter.getName());
		response.setStatus(objectRespClienteCharacter.getStatus());
		response.setSpecies(objectRespClienteCharacter.getSpecies());
		response.setType(objectRespClienteLocation.getType());
		response.setEpisode_count(String.valueOf(objectRespClienteCharacter.getEpisode().size()));
		response.getOrigin().setName(objectRespClienteCharacter.getOrigin().getName());
		response.getOrigin().setUrl(objectRespClienteCharacter.getOrigin().getUrl());
		response.getOrigin().setDimension(objectRespClienteLocation.getDimension());
		List<Residents> rList = new ArrayList<Residents>();
		objectRespClienteLocation.getResidents().forEach(resident -> {
			Residents residents = new Residents();
			residents.setUrlResidents(resident.getUrlResidents());
			rList.add(residents);
		});
		response.getOrigin().setResidents(rList);
		return response;
	}
}
