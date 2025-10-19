package com.expo.managmentSystem.controller;

import com.expo.managmentSystem.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/welcomeProduct")
    public String welcomeUser() {
        log.info("Accessed Product endpoint");
        productService.welcome();
        return "Welcome to the Product Management System!";
    }
}
