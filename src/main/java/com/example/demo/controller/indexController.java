package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @Value("${prop.valor}")
    private String nombre;

    @GetMapping({"/index", "/", "/home"})
    public String index(Model model) {
        model.addAttribute("Nombre", nombre);
        return "index";
    }
}
