package com.firefight.controller;

import com.firefight.bean.Blog;
import com.firefight.service.Impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("api/blog")
public class BlogController {

 @Autowired
 private BlogServiceImpl blogService;
    @PostMapping("postBlog")
    public String postBlog(Blog blog){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sf.format(new Date());
        blog.setCreate_time(format);
        System.out.println(blog);
        blogService.addBlog(blog);
        return "/manager/postManager";
    }

    @GetMapping("/newBlogs")
    public ModelAndView getPosts(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("manager/postManager");
        modelAndView.addObject("allBlogs",blogService.findNew());
        return modelAndView;
    }

}
