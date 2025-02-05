package com.example.CustomerManagement.ServicesImplementation;

import com.example.CustomerManagement.Dao.PersonDAO;
import com.example.CustomerManagement.Services.PersonService;
import com.example.CustomerManagement.entities.Person;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDAO personDao;

    @Override
    @Transactional(readOnly = true)
    public List<Person> listPersons(){
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDao.delete(person);
    }

    @Override
    @Transactional
    public Person searchPerson(Person person){
        return personDao.findById(person.getId()).orElse(null);
    }
}
