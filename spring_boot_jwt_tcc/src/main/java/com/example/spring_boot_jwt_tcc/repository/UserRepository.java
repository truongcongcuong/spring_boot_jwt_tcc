package com.example.spring_boot_jwt_tcc.repository;

import com.example.spring_boot_jwt_tcc.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
