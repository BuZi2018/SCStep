package com.step.stepmsuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @GetMapping(value = "/user/{username}")
    public String getUser(@PathVariable("username") String username){

        return username + new Date();
    }
}
