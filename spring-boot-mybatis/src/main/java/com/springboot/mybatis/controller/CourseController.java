package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.CourseVO;
import com.springboot.mybatis.service.CourseService;
import com.springboot.mybatis.util.RandomUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 张文旭 on 2019/3/18.
 */
@RestController
@RequestMapping(value = "/api")
public class CourseController {
    @Resource
    private CourseService courseService;

    @RequestMapping(value = "/courses",method = RequestMethod.GET)
    public List<Course> selectAll(){
        return courseService.seleceAll();
    }


    @RequestMapping(value = "/course/{id}",method =RequestMethod.GET)
    public Course getOne(@PathVariable("id") long id){
        return  courseService.getOne(id);

    }
    @RequestMapping(value = "/course/{id}",method = RequestMethod.DELETE)
    public  void  delete(@PathVariable("id") long id){
        courseService.delete( id );
    }

    @RequestMapping(value = "/course",method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course){
        course.setCourseCode( RandomUtil.getRandomCode() );
          courseService.insert(course);
    }
    @RequestMapping(value = "/course",method = RequestMethod.PUT)
    public  void update(@RequestBody Course course){
        courseService.update(course);
    }


    // 查找正在进行的班课
    @RequestMapping(value = "/cur-courses", method = RequestMethod.GET)
    public List<CourseVO> selectCourses() {
        List<CourseVO> courseVOList = courseService.selectCurrentCourses();
        return courseVOList;
    }
    //查找已经结束的班课
    @RequestMapping(value = "/fin-courses", method = RequestMethod.GET)
    public List<CourseVO> selectFinshedCourses() {
        List<CourseVO> courseVO1List = courseService.selectFinshedCourses();
        return courseVO1List;
    }
}
