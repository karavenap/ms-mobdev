package com.mobdev.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mobdev.dto.CharacterLocationRQ;
import com.mobdev.service.CharacterService;

@RestController
public class ControllerCharacter {
	
	 @Autowired private CharacterService characterService;
	 

	 
	 @GetMapping("/character/{id}")
	 public ResponseEntity getCharactersRickmorty(@PathVariable String id) throws Exception{
	 CharacterLocationRQ chara = new CharacterLocationRQ(); 
	 chara.setId(id);
	 return ResponseEntity.ok().body(characterService.request(chara));
		 
	 }
	
	@GetMapping("/healthcheck")
	public ResponseEntity test() throws Exception{
		return ResponseEntity.ok("Hola");
	}


}
