package com.xxm.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Program: IntelliJ IDEA vuejs_demo_springfamilymeals
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-21 10:05:45 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Entity
/**
 * @Table(name = "user")
 */
public class User {
    /**
     * @Column(name = "id")
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * @Column(name = "username")
     */
    private String username;
    private String password;
    private String sex;
    private int age;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
