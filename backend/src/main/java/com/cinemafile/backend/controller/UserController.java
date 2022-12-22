package com.cinemafile.backend.controller;

import com.cinemafile.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
// localhost:8080/user/...
public class UserController {
    @Autowired
    private UserService userService;
} // end of class UserController
