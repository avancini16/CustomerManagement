package com.example.CustomerManagement.Controller;

import com.example.CustomerManagement.Services.PersonService;
import com.example.CustomerManagement.entities.Person;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
@Slf4j
public class Controller {

    @Autowired
    private PersonService personService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/logout")
    public String performLogout() {
        return "login";
    }

    @GetMapping("/")
    public String start(Model model){
        var persons = personService.listPersons();
        model.addAttribute("persons", persons);
        return "index";
    }

    @GetMapping("/add")
    public String add(Person person){
        return "addPerson";
    }

    @PostMapping("/save")
    public String save(@Valid Person person, Errors errors){
        if(errors.hasErrors()){
            return "addPerson";
        }
        personService.save(person);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(Person person, Model model){
        person = personService.searchPerson(person);
        model.addAttribute("person", person);
        return "addPerson";
    }

    @GetMapping("/delete")
    public String delete(Person person){
        personService.delete(person);
        return "redirect:/";
    }
}
