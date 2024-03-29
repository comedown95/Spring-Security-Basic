package com.security.basic.service;

import com.security.basic.entity.UserDTO;
import com.security.basic.entity.UserEntity;
import com.security.basic.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JoinService {

    final private UserRepository userRepository;
    final private BCryptPasswordEncoder encoder;

    public JoinService(UserRepository userRepository, BCryptPasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    public void joinProcess(UserDTO dto) {
        String username = dto.getUsername();
        String password = encoder.encode(dto.getPassword());
        String role = "ROLE_ADMIN";

        if (userRepository.existsByUsername(username)) log.info("중복된 사용자입니다.");

        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);

        userRepository.save(user);

        log.info("회원가입 성공");
    }
}
