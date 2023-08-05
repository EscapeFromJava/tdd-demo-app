package com.example.tdddemoapp.repository;

import com.example.tdddemoapp.model.entity.Person;

public interface PersonRepository {
    Person find(Integer id);

    String save(Person person);
}
