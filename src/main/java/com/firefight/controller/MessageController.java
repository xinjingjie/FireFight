package com.firefight.controller;

import com.firefight.bean.Message;
import com.firefight.service.Impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
