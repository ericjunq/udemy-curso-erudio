package com.ericjunq.service;

import com.ericjunq.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id){
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Eric");
        person.setLastName("Junqueira");
        person.setAddress("Caetité, BA - Brazil");
        person.setGender("Male");

        return person;
    }

    public List<Person> findAll(){
        logger.info("Finding all people!");
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            people.add(person);
        }

        return people;
    }

    public Person updatePerson(Person person){
        logger.info("Updating a Person!");
        return person;
    }

    public Person createPerson(Person person){
        logger.info("Creating a Person!");

        return person;
    }

    public void deletePerson(String id){
        logger.info("Deleting a Person");
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName" + i);
        person.setLastName("LastName" + i);
        person.setAddress("SomeAdress in Brazil" + i);
        person.setGender("Male");

        return person;
    }


}
