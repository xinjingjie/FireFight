package com.firefight.dao;

import com.firefight.bean.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageDao {

/*
留言
 */
    @Insert("insert into message(name,title,content,telephone,location,create_time) values(#{name},#{title},#{content},#{telephone},#{location},#{create_time})")
    int addMessage(Message message);
/*
查找所有留言
 */
    @Select("select * from message")
    List<Message> allMessage();
}
