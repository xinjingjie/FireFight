package com.firefight.dao;

import com.firefight.bean.Blog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface BlogDao {
    /*
    插入新的blog
     */
    @Insert("insert into blog(uid,author,title,content,create_time,likes,dislikes,reply_number,sort) values(#{uid},#{author},#{title},#{content},#{create_time},#{likes},#{dislikes},#{reply_number},#{sort})")
    int addBlog(Blog blog);
    /*
    查找最新发布的20条
     */
    @Select("select * from blog order by create_time desc limit 0,20")
    List<Blog> findNew();
/*
删除发布的消息
 */
    @Delete("delete from blog where b_id=#{b_id}")
    int deleteById(int b_id);

    /*
    根据分类查找
     */
    @Select("select * from blog where sort=#{sort}")
    List<Blog> findBySort(String sort);
}
