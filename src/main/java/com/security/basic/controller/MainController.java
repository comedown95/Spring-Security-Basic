package com.security.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "main Controller";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin Controller";
    }

}
