package com.wyc.dao;

import com.wyc.pojo.User;

public interface UserDao {
    void addUser(User user);
    void deleteUser(User user);
}
