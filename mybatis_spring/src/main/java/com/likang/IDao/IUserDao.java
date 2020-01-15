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
    User findUserById(int id);
    List<User> findByName(String userName);
    int findNum();
    List<User> queryList(User user);
}
