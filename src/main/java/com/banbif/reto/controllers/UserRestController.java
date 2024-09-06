package com.banbif.reto.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banbif.reto.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User ("Christian","Palomino");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Banbif");
        body.put("user", user);
        return body;
    }
    
}
