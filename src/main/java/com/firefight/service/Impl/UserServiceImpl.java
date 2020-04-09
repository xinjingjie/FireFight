package com.firefight.service.Impl;

import com.firefight.bean.User;
import com.firefight.dao.UserDao;
import com.firefight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAllUser() {

        System.out.println("查找所有用户");
        return userDao.findAllUser();
    }

    @Override
    public User findUserById(int id) {
        System.out.println("根据id查找用户");
        return userDao.findUserById(id);
    }

    @Override
    public User findUserByName(String name) {
    return userDao.findUserByName(name);
    }

    @Override
    public boolean passwordIsRight(String name,String password) {
        return password.equals(userDao.getPasswordByName(name));
    }

    @Override
    public int addUser(User user) {
        System.out.println("新增用户");
        return userDao.addUser(user);
    }

    @Override
    public String getIdentifyByName(String username) {
        return userDao.getIdentifyByName(username);
    }

    @Override
    public int getIdByName(String username) {
        return userDao.getIdByName(username);
    }
}
