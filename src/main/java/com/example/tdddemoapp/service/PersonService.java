package com.example.tdddemoapp.service;

import com.example.tdddemoapp.model.dto.PersonDto;

public interface PersonService {
    PersonDto getById(Integer id);

    String save(PersonDto dto);
}
