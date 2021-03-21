package com.mobdev.service;

import com.mobdev.dto.CharacterLocationRQ;
import com.mobdev.dto.CharacterLocationRS;

public interface CharacterService {

	CharacterLocationRS request(CharacterLocationRQ id) throws Exception;
}
