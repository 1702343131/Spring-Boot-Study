package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 张文旭 on 2019/3/18.
 */
public interface UserMapper {
    @Results({
            @Result(column = "user_id",property = "userId"),
            @Result(property = "mobile", column = "mobile"),
            @Result(property = "passward", column = "passward"),
            @Result(property = "username", column = "username"),
            @Result(property = "avatar", column = "avatar")
    })
    @Select("SELECT * FROM t_sys_user ")
    List<User> selectAll();

    @Results({
            @Result(column = "user_id",property = "userId"),
            @Result(property = "mobile", column = "mobile"),
            @Result(property = "passward", column = "passward"),
            @Result(property = "username", column = "username"),
            @Result(property = "avatar", column = "avatar")
    })
    @Select("SELECT * FROM t_sys_user WHERE user_id = #{userId} ")
    User getOne(Long userId);


    @Delete( "DELETE FROM t_sys_user WHERE user_id =#{userId}" )
    void delete(Long userId);

    @Insert("INSERT INTO t_sys_user(user_id,mobile,passward,username,avatar)"
            + "VALUES(#{userId},#{mobile},#{passward},#{username},#{avatar}) ")
    void  insert(User user);


    @Update("UPDATE t_sys_user SET username=#{username},mobile=#{mobile} WHERE user_id =#{userId}")
    void update(User user);
}
