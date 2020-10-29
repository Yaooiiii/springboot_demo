package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public void insert(UserModel user) {
        userMapper.insert(user);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }

    public void update(UserModel user) {
        userMapper.update(user);
    }

    public UserModel findUserById(Long id) {
        return userMapper.findUserById(id);
    }
}
