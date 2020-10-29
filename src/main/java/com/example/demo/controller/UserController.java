package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody UserModel user) {
        userService.insert(user);
    }

    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    public UserModel findById(@RequestParam Long id) {
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam Long id) {
        userService.delete(id);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public void updateUser(@RequestBody UserModel user) {
        userService.update(user);
    }
}
