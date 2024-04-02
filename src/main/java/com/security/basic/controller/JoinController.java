package com.security.basic.controller;

import com.security.basic.Service.JoinService;
import com.security.basic.dto.JoinDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(JoinDTO dto) {
        log.info("username={}, password={}", dto.getUsername(), dto.getPassword())
        joinService.joinProcess(dto);
        return "ok";
    }
}