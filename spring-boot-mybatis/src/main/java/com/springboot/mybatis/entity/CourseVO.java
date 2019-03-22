package com.springboot.mybatis.entity;

import lombok.Data;

/**
 * Created by 张文旭 on 2019/3/22.
 */
@Data
public class CourseVO {
    private Long courseId;
    private String courseName;
    private Long userId;
    private String courseClass;
    private String cover;
    private String courseCode;
    private Short finished;
    private String username;
    private String avatar;
}
