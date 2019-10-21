package com.xxm.dao;

import com.xxm.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Program: IntelliJ IDEA vuejs_demo_springfamilymeals
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-21 10:13:52 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
