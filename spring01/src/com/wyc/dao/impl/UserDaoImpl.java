package com.wyc.dao.impl;

import com.wyc.dao.UserDao;
import com.wyc.pojo.User;

/**
 * @ClassName UserDaoImpl
 * @Author 王韫琛
 * @Date 2021/1/12 13:43
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println("添加成功");
    }
    @Override
    public void deleteUser(User user) {
        System.out.println("删除成功");
    }
}
