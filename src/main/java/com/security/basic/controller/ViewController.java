package com.security.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String mainPage() {
        return "main";
    }

    @GetMapping("/my")
    public String myPage() {
        return "my";
    }
}
