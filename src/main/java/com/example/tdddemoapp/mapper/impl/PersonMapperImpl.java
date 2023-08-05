package com.example.tdddemoapp.mapper.impl;

import com.example.tdddemoapp.mapper.PersonMapper;
import com.example.tdddemoapp.model.dto.PersonDto;
import com.example.tdddemoapp.model.entity.Person;

public class PersonMapperImpl implements PersonMapper {
    @Override
    public PersonDto convert(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setName(person.getFullName());
        return personDto;
    }

    @Override
    public Person convert(PersonDto dto) {
        Person person = new Person();
        person.setFullName(dto.getName());
        return person;
    }
}
