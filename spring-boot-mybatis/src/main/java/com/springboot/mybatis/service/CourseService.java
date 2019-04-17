package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.CourseVO;

import java.util.List;

/**
 * Created by 张文旭 on 2019/3/18.
 */
public interface CourseService {
    List<Course> seleceAll();

    Course getOne(long courseId);

    void delete(long  courseId);
    void   insert(Course course);

    void update(Course course);

    List<CourseVO> selectCurrentCourses();
    List<CourseVO> selectFinshedCourses();
}
