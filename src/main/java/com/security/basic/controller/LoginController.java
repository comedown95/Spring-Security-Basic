package com.security.basic.controller;

import com.security.basic.entity.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class LoginController {
    @GetMapping("/login")
    public String loginPage() {
        log.info("로그인 페이지 접근");
        return "login";
    }
}
