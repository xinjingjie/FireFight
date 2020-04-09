package com.firefight.service.Impl;

import com.firefight.bean.Message;
import com.firefight.dao.MessageDao;
import com.firefight.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao messageDao;
    @Override
    public int addMessage(Message message) {
        return messageDao.addMessage(message);
    }

    @Override
    public List<Message> allMessage() {
        return messageDao.allMessage();
    }
}
