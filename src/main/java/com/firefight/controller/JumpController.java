package com.firefight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JumpController {
//    @RequestMapping("/login")
//    public String main(){
//        return "login";  //在视图解析器中配置了前缀后缀
//    }
    @RequestMapping("/{name}")
    public String go(@PathVariable("name") String what){
        return what;  //在视图解析器中配置了前缀后缀
    }
    @RequestMapping("/{name1}/{name2}")
    public String goNext(@PathVariable("name1") String parent,@PathVariable("name2") String child){
        return parent+"/"+child;  //在视图解析器中配置了前缀后缀
    }
}
