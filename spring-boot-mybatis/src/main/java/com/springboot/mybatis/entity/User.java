package com.springboot.mybatis.entity;

import lombok.Data;

/**
 * Created by 张文旭 on 2019/3/18.
 */
@Data
public class User {
    private Long userId;
    private String mobile;
    private String passward;
    private String username;
    private String avatar;
}
