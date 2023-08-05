package com.example.tdddemoapp.service.impl;

import com.example.tdddemoapp.mapper.PersonMapper;
import com.example.tdddemoapp.model.dto.PersonDto;
import com.example.tdddemoapp.model.entity.Person;
import com.example.tdddemoapp.repository.PersonRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PersonServiceImplTest {

    @Mock
    private PersonRepository personRepository;

    @Mock
    private PersonMapper personMapper;

    @InjectMocks
    private PersonServiceImpl personService;


    @Test
    @DisplayName("Should save the person when the personDto is valid")
    void savePersonWhenPersonDtoIsValid() {
        PersonDto personDto = new PersonDto("John Doe");
        Person person = new Person("John Doe");

        when(personMapper.convert(personDto)).thenReturn(person);
        when(personRepository.save(person)).thenReturn("Saved");

        String result = personService.save(personDto);

        assertEquals("Saved", result);
        verify(personMapper, times(1)).convert(personDto);
        verify(personRepository, times(1)).save(person);
    }

}