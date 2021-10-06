package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

     @GetMapping({"index","home","/"})
    public String index (){
        return "Hello Word !!!";
    }
}
