package com.example.CustomerManagement.Dao;

import com.example.CustomerManagement.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO extends JpaRepository<Person, Long> {

}
