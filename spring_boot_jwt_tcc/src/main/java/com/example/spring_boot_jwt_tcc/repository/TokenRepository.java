package com.example.spring_boot_jwt_tcc.repository;

import com.example.spring_boot_jwt_tcc.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
