package com.java.santanderbootcamp_APIRest.service;


import com.java.santanderbootcamp_APIRest.model.Users;

public interface UserService {
    Users findById(Long id);

    Users create(Users userCreate);
}
