package com.banbif.reto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hello Banbif");
        model.addAttribute("name", "Christian");
        model.addAttribute("lastname", "Palomino");
        return "details";
    }
    
}
