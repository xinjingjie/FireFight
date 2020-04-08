package com.firefight.dao;

import com.firefight.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
/*
查找所有用户
 */
    @Select("Select * FROM user")
    public List<User> findAllUser();
    /*
      根据id查找用户
       */
    @Select("select * from user where uid=#{id}")
    public User findUserById(int id);
    /*
        新增用户
         */
    @Insert("Insert into user(username,gender,identify,password,telephone) values(#{username},#{gender},#{identify},#{password},#{telephone})")
    public int addUser(User user);
    /*
        根据用户名查找用户
         */
    @Select("select * from user where username=#{name}")
    User findUserByName(String name);
    /*
        根据用户名获取密码
         */
    @Select("select password from user where username=#{name}")
    String getPasswordByName(String name);
    /*
    查找用户身份
     */
    @Select("select identify from user where username=#{username}")
    String getIdentifyByName(String username);
}
