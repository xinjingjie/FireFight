package com.firefight.bean;

/*
管理员发的帖子
 */
public class Blog {
    //id
    private int b_id;
    //管理员id
    private int uid;
    //标题
    private String title;
    //内容
    private String content;
    //发布时间
    private String create_time;
    //点赞
    private int likes;
    //踩
    private int dislikes;
    //回复数量
    private int reply_number;
}
