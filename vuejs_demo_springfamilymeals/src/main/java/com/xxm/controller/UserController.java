package com.xxm.controller;

import com.xxm.pojo.User;
import com.xxm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Program: IntelliJ IDEA vuejs_demo_springfamilymeals
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-21 10:24:38 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */

/**
 * @Controller
 * @ResponseBody
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        List<User> list = userService.findAll();
        return list;
    }

    /**
     * 传统方式：http://localhost:8080/user/findAll?id=1
     *
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public User findById(Integer id) {
        User user = userService.findById(id);
        return user;
    }

//    //http://localhost:8080/user/findById/1
//    @RequestMapping("/findById/{id}")
//    public User findById(@PathVariable(value = "id") Integer id) {
//        User user = userService.findById(id);
//        return user;
//    }

    @RequestMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }
}
