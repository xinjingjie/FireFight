package com.firefight.dao;

import com.firefight.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    @Select("Select * FROM user")
    public List<User> findAllUser();
    public User findUserById(int id);
    @Insert("Insert into user(name,gender) values(#{name},#{gender})")
    public int addUser(User user);
}
