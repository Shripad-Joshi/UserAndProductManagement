package com.expo.managmentSystem.controller;

import com.expo.managmentSystem.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/welcomeUser")
    public String welcomeUser() {
        log.info("Accessed /User endpoint");
        userService.welcome();
        return "Welcome to the User Management System!";
    }
}
