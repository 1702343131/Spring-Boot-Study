package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.User;

import java.util.List;

/**
 * Created by 张文旭 on 2019/3/18.
 */
public interface UserService {
    List<User> selectAll();

    User getOne(long userId);
    void  delete(long userId);
    void  insert(User user);
    void update(User user);
}
