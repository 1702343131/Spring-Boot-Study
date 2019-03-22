package com.springboot.mybatis.entity;

import lombok.Data;

/**
 * Created by 张文旭 on 2019/3/18.
 */

@Data
public class Course {
    private Long courseId;
    private String courseName;
    private Long userId;
    private String courseClass;
    private String cover;
    private String courseCode;
    private Short finished;
}