package com.ericjunq.controllers;

import com.ericjunq.model.Person;
import com.ericjunq.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") String id){
        return personService.findById(id);
    }


    @GetMapping()
    public List<Person> findAll(){
        return personService.findAll();
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person){
        return personService.updatePerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") String id){
        personService.deletePerson(id);
    }
}
