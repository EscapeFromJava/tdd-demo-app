package com.example.tdddemoapp;

import com.example.tdddemoapp.mapper.PersonMapper;
import com.example.tdddemoapp.model.dto.PersonDto;
import com.example.tdddemoapp.model.entity.Person;
import com.example.tdddemoapp.repository.PersonRepository;
import com.example.tdddemoapp.service.impl.PersonServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonDtoServiceImplTest {

    @Mock
    PersonMapper personMapper;
    @Mock
    PersonRepository personRepository;
    @InjectMocks
    PersonServiceImpl personService;

    @Test
    void getPersonById() {
        //given
        Person entity = new Person();
        PersonDto person = new PersonDto("Alex");
        when(personRepository.find(1)).thenReturn(entity);
        when(personMapper.convert(entity)).thenReturn(person);
        //when
        PersonDto personDto = personService.getById(1);
        //then
        assertThat(personDto).isNotNull();
        assertThat(personDto.getName()).isEqualTo("Alex");
    }

    @Test
    void savePersonDto() {
        //given
        PersonDto dto = new PersonDto("Model");
        when(personRepository.save(any())).thenReturn("Person saved");
        //when
        String result = personService.save(dto);
        //then
        assertThat(result).isEqualTo("Person saved");
    }
}
