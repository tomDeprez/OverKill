package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        int a = 1;
        int b = 2;
        int c = a + b;
        
        return "home";
    }
} 