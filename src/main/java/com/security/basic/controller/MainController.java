package com.security.basic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MainController {
    @GetMapping("/")
    public String mainPage() {
        log.info("메인 페이지 접근");
        return "main";
    }
}
