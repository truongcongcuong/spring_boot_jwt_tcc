package com.example.spring_boot_jwt_tcc.service;

import com.example.spring_boot_jwt_tcc.entity.*;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
