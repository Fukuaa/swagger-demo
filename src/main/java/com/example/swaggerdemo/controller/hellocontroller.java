package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.pojo.user;
import com.example.swaggerdemo.service.Aservice;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellocontroller {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @ResponseBody
    //只要我们的接口中，返回值中存在实体类，他就会被扫描到Swagger
    @RequestMapping(value = "/user")
    public user user(){
        return new user();
    }
    @ResponseBody
    @ApiOperation("hello控制类")
    @RequestMapping(value = "/use1r")
    public String user1(String name){
        return "hello"+name;
    }
    @Autowired
    Aservice aservice;
    @ResponseBody
    @RequestMapping("/use")
    public String hello1(){
        aservice.hello();
        return "ok";
    }
}
