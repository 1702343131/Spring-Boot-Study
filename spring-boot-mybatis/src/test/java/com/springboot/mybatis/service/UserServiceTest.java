package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by 张文旭 on 2019/3/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Resource
    private  UserService userService;
    @Test
    public void selectAll() throws Exception {
        List<User> userList = userService.selectAll();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void getOne() throws Exception {
        User user = userService.getOne(1L);
        System.out.println(user);
    }

    @Test
    public void delete() throws Exception {
        userService.delete(2L);
    }

    @Test
    public void insert() throws Exception {
       User user = new User();
       user.setUsername("张文旭");
       user.setAvatar("444.jpg");
       user.setPassward("123");
       user.setMobile("12345678911");
       userService.insert(user);
    }

    @Test
    public void update() throws Exception {
        User user = userService.getOne(4L);
        user.setMobile("1702343131");
        user.setUsername("狗蛋");
        userService.update(user);
    }
}