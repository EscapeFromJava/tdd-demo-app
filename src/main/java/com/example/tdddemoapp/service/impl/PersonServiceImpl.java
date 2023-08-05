package com.example.tdddemoapp.service.impl;

import com.example.tdddemoapp.mapper.PersonMapper;
import com.example.tdddemoapp.repository.PersonRepository;
import com.example.tdddemoapp.model.dto.PersonDto;
import com.example.tdddemoapp.model.entity.Person;
import com.example.tdddemoapp.service.PersonService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    @Override
    public PersonDto getById(Integer id) {
        System.out.println("Get");
        Person person = personRepository.find(id);
        return personMapper.convert(person);
    }

    @Override
    public String save(PersonDto dto) {
        System.out.println("Save");
        Person convert = personMapper.convert(dto);
        return personRepository.save(convert);
    }
}
