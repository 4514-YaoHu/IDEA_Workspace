package com.wyc.service.impl;

import com.wyc.dao.UserDao;
import com.wyc.pojo.User;
import com.wyc.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Author 王韫琛
 * @Date 2021/1/12 13:38
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    //注入userDao
    private UserDao userDao;
    //提供set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    //添加用户
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
}
