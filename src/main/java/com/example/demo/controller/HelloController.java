package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;



@RestController
public class HelloController {

    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }
}
