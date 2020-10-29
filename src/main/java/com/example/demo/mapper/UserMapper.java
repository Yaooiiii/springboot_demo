package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByName(@Param("name") String name);

    int insert(@Param("name") String name, @Param("age") Integer age);

    void delete(Long id);
}
