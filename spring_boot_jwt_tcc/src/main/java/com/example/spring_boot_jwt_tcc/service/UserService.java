package com.example.spring_boot_jwt_tcc.service;

import com.example.spring_boot_jwt_tcc.authen.*;
import com.example.spring_boot_jwt_tcc.entity.*;

public interface UserService {
	User createUser(User user);

	UserPrincipal findByUsername(String username);
}
