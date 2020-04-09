package com.firefight.service;

import com.firefight.bean.Message;

import java.util.List;

public interface MessageService {
    int addMessage(Message message);
    List<Message> allMessage();

}
