package com.likang.IDao;

import com.likang.model.User;

import java.util.List;

/**
 * 用户
 */
public interface IUserDao {
    List<User> findAll();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
