package com.spring.cloud.demo.web.admin.ribbon.controller;

import com.spring.cloud.demo.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired          //对类成员变量、方法及构造函数进行标注，完成自动装配的工作
    private AdminService adminService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message){
        return adminService.sayHi(message);
    }
}
