package com.cinemafile.backend.service.impl;

import com.cinemafile.backend.repository.UserRepository;
import com.cinemafile.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

} // end of class UserServiceImpl