package com.firefight.controller;

import com.firefight.bean.Message;
import com.firefight.service.Impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/api/message")
public class MessageController {
    @Autowired
    private MessageServiceImpl messageService;
    @PostMapping("/addMessage")
    public String addMessage(Message message){

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sf.format(new Date());
        message.setCreate_time(format);
        messageService.addMessage(message);
        return "contact";
    }
    @GetMapping("/allMessage")
    public ModelAndView allMessage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("allMessages",messageService.allMessage());
        modelAndView.setViewName("manager/messageManager");
        return modelAndView;
    }
}
