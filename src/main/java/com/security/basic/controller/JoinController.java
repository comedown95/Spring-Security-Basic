package com.security.basic.controller;

import com.security.basic.entity.UserDTO;
import com.security.basic.service.JoinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class JoinController {

    final private JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @GetMapping("/join")
    public String joinPage() {
        log.info("회원가입 페이지 접근");
        return "join";
    }

    @PostMapping("/join")
    public String join(UserDTO dto) {
        log.info("회원가입 시도 username={}, password={}", dto.getUsername(), dto.getPassword());
        joinService.joinProcess(dto);
        return "redirect:/login";
    }
}