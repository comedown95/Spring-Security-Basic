package com.security.basic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Iterator;

@Controller
@Slf4j
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        log.info("메인 페이지 접근");
        return "main";
    }

    @GetMapping("/profile")
    public String profilePage(Model model) {
        log.info("프로필 페이지 접근");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        Iterator<? extends GrantedAuthority> iter = authorities.iterator();
        GrantedAuthority auth = iter.next();

        String id = authentication.getName();
        String role = auth.getAuthority();

        model.addAttribute("id", id);
        model.addAttribute("role", role);
        return "profile";
    }
}
