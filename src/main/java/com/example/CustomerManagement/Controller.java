package com.example.CustomerManagement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
@Slf4j
public class Controller {
    @GetMapping("/")
    public String start(){
        return "index";
    }
}
