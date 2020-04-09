package com.firefight.service;

import com.firefight.bean.User;

import java.util.List;

public interface UserService {
    /*
    查找所有用户
     */
    public List<User> findAllUser();
    /*
   根据id查找用户
    */
    public User findUserById(int id);
    /*
    根据用户名查找用户
     */
    public User findUserByName(String name);
    /*
    登录 true为密码正确
     */
    public boolean passwordIsRight(String name,String password);
    /*
    注册
     */
    public int addUser(User user);

    /*
    根据用户名查找身份
     */
    String getIdentifyByName(String username);
    int getIdByName(String username);

}
