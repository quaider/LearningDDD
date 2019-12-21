package org.example.userDDD.userInterface.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/register")
    public String register() {
        return "Hello world";
    }

    @GetMapping("/user/{username}")
    public void getUser(@PathVariable String username) {

    }

    @PostMapping("/login")
    public void login() {

    }

    @PostMapping("/logout")
    public void logout() {

    }
}
