package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.PUT)
    public void addUser(@RequestBody User user) {
        userService.insert(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public void deletUser(@RequestParam Long id) {
        userService.delete(id);
    }

}
