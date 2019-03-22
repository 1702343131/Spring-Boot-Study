package com.springboot.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 张文旭 on 2019/3/18.
 * SpringBoot的第一个RESTful请求
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)//请求路径
    public String getHello(){
        return "Hello,spring boot";
    }
}
