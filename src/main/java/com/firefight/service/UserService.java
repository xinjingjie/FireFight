package com.firefight.service;

import com.firefight.bean.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();
    public User findUserById(int id);
    public int addUser(User user);
}
