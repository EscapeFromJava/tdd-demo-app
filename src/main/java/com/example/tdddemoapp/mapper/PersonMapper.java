package com.example.tdddemoapp.mapper;

import com.example.tdddemoapp.model.dto.PersonDto;
import com.example.tdddemoapp.model.entity.Person;

public interface PersonMapper {
    PersonDto convert(Person person);

    Person convert(PersonDto dto);
}
