package com.example.demo.mapper;

import com.example.demo.model.UserModel;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 根据用户id查询用户
     *
     * @param id 用户id
     * @return 查询到的用户
     */
    UserModel findUserById(Long id);

    /**
     * 新增一个用户
     *
     * @param user 用户参数
     * @return 影响行数
     */
    int insert(@Param("param") UserModel user);

    /**
     * 根据id删除一个用户
     *
     * @param id 用户id
     */
    void delete(Long id);

    /**
     * 更新用户信息
     *
     * @param user 要更新的用户信息
     */
    void update(@Param("param") UserModel user);
}
