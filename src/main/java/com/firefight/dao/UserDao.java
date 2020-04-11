package com.firefight.dao;

import com.firefight.bean.User;
import org.apache.ibatis.annotations.*;
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
    @Insert("Insert into user(username,gender,identify,password,telephone,profile_id,location) values(#{username},#{gender},#{identify},#{password},#{telephone},#{profile_id},#{location})")
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
    /*
    根据name查找id
     */
    @Select("select uid from user where username=#{username}")
    int getIdByName(String username);

    /*
    更新用户信息
     */
    @Update("update user set username=#{username},gender=#{gender},telephone=#{telephone},profile_id=#{profile_id},location=#{location} where uid=#{uid}")
    int updateUser(User user);

    /*
    根据用户名查看用户是否存在
     */
    @Select("select count(*) from user where username=#{username}")
    int isUserExist(String username);

    /*
        根据用户名查看身份证号是否存在
         */
    @Select("select count(*) from user where profile_id=#{profile_id}")
    int isUserExistByProfileId(String profile_id);
}
