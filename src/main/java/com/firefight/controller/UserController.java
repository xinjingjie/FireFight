package com.firefight.controller;

import com.firefight.bean.User;
import com.firefight.service.UserService;
import com.mysql.cj.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired   //按类型注入
    private UserService UserService;
    @RequestMapping("/test")
    public String findAll(){
        System.out.println("Controller表现层：查询所有账户...");
        // UserService.findAllUser();
        return "list";  //在视图解析器中配置了前缀后缀
    }
    @RequestMapping("/main")
    public String main(){
        return "login";  //在视图解析器中配置了前缀后缀
    }


    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public String login(HttpServletRequest request) throws IOException {

        String userName=request.getParameter("userName");
        String passWord=request.getParameter("passWord");
        System.out.println("ssss"+userName+passWord);
       if (UserService.passwordIsRight(userName,passWord)){
           System.out.println("success");
           HttpSession session=request.getSession();
           session.setAttribute("uid",UserService.getIdByName(userName));
           System.out.println(session.getAttribute("uid"));
           return "index";
       };
    return "login";
//        modelAndView.setViewName("login.html");
//        return modelAndView;  //在视图解析器中配置了前缀后缀
    }
    @RequestMapping("/register")
    public String register(User user){
        UserService.addUser(user);
        return "login";  //在视图解析器中配置了前缀后缀
    }
}
