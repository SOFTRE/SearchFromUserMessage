package com.xxm.service;

import com.xxm.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Integer id);

    void update(User user);
}
