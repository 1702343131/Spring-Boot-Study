package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.CourseVO;
import com.springboot.mybatis.util.RandomUtil;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 张文旭 on 2019/3/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceTest {
    @Resource
    private CourseService courseService;

    @Test
    public void seleceAll() throws Exception {
        List <Course> courseList = courseService.seleceAll();
        courseList.forEach( course -> System.out.println( course ) );
    }

    @Test
    public void getOne() throws Exception {
        Course course = courseService.getOne( 1L );
        System.out.println( course );

    }

    @Test
    public void delete() throws Exception {
        courseService.delete( 6L );
    }

    @Test
    public void insert() throws Exception {
         Course course = new Course();
         course.setCourseName( "微信小程序开发" );
         course.setCourseClass( "软件1721" );
         course.setUserId( 1L );
         course.setCover( "1.jpg" );
         course.setCourseCode( RandomUtil.getRandomCode() );
         course.setFinished( (short)0);
         courseService.insert( course );

    }

    @Test
    public void update() throws Exception {
        Course course = courseService.getOne(4L);
        course.setCover("999.jpg");
        course.setFinished((short) 1);
        courseService.update(course);
}

    @Test
    public void selectCurrentCourses() throws Exception {
        List<CourseVO> courseVOList = courseService.selectCurrentCourses();
        courseVOList.forEach(courseVO -> System.out.println(courseVO));
    }
    @Test
    public void selectFinshedCourses() throws Exception {
        List<CourseVO> courseVOList = courseService.selectFinshedCourses();
        courseVOList.forEach(courseVO -> System.out.println(courseVO));
    }
}