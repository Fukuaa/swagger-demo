package com.example.swaggerdemo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体类")//注释
public class user {
    @ApiModelProperty("id ")
    private int id;
    @ApiModelProperty("用户名 ")
    private String name;
    private String password;
    private String perms;

    public user(int id, String name, String password, String perms) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.perms = perms;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", perms='" + perms + '\'' +
                '}';
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public user(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public user() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
