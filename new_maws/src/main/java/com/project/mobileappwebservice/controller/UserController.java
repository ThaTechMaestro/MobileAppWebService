package com.project.mobileappwebservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(){

        return "List of Users"
    }

    @PostMapping
    public String createUser(@RequestBody UserDetailsRequestModel){
        return "List of Users";

    }

    @PutMapping
    public String updateUser(){

        return "List of users";
    }

    @DeleteMapping
    public String deleteUser(){

    }
}
