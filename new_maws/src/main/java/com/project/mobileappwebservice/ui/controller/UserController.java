package com.project.mobileappwebservice.ui.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.project.mobileappwebservice.service.UserService;
import com.project.mobileappwebservice.shared.dto.UserDto;
import com.project.mobileappwebservice.ui.model.request.UserDetailsRequestModel;
import com.project.mobileappwebservice.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    public String getUser(){

        return "List of Users";
    }


    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){

        UserDto userDto = new UserDto();
        UserRest returnValue = new UserRest();

        BeanUtils.copyProperties(userDetails, userDto);
        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(userDetails, userDto);

        return returnValue;

    }


    @PutMapping
    public String updateUser(){

        return "List of users";
    }

    @DeleteMapping
    public String deleteUser(){
        return "List of Users";

    }
}
