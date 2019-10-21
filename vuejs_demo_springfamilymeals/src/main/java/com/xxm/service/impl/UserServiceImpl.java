package com.xxm.service.impl;

import com.xxm.dao.UserDao;
import com.xxm.pojo.User;
import com.xxm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Program: IntelliJ IDEA vuejs_demo_springfamilymeals
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-21 10:19:03 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Service
@Transactional(rollbackFor = {java.lang.Exception.class})
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }
}
