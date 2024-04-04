package com.security.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")

    public String mainEndPoint() {
        return "main route";
    }

    @GetMapping("/my")
    public String myEndPoint() {
        return "my route";
    }
}
