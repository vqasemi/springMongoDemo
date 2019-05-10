package com.qbros.mongoRepository.controller;

import com.qbros.mongoRepository.persist.model.Person;
import com.qbros.mongoRepository.persist.repository.PersonRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */

@RestController
@RequestMapping("/persons")
public class Persons {
    private PersonRepo personRepository;

    public Persons(PersonRepo personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping()
    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
