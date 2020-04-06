package com.firefight.controller;

import com.firefight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {

    @Autowired   //按类型注入
    private UserService UserService;

    @RequestMapping("/test")
    public String findAll(){
        System.out.println("Controller表现层：查询所有账户...");
        UserService.findAllUser();
        return "list";  //在视图解析器中配置了前缀后缀
    }
}
