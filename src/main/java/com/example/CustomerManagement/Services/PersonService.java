package com.example.CustomerManagement.Services;

import com.example.CustomerManagement.entities.Person;

import java.util.List;

public interface PersonService {
    public List<Person> listPersons();

    public void save(Person person);

    public void delete(Person person);

    public Person searchPerson(Person person);
}
