package com.java.santanderbootcamp_APIRest.service.impl;

import com.java.santanderbootcamp_APIRest.model.Users;
import com.java.santanderbootcamp_APIRest.model.repository.UserRepository;
import com.java.santanderbootcamp_APIRest.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public Users findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Users create(Users userCreate) {
        if (userRepository.existsByAccountNumber(userCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(userCreate);
    }
}
