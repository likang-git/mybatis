package com.likang.IDao;

import com.likang.model.User;

import java.util.List;

/**
 * 用户
 */
public interface IUserDao {
    List<User> findAll();
}
