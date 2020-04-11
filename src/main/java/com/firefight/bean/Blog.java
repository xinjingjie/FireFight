package com.firefight.bean;

/*
管理员发的帖子
 */
public class Blog {
    //id
    private int b_id;
    //作者
    private String author;
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
    //分类
    private String sort;

    public Blog(int b_id, String author, int uid, String title, String content, String create_time, int likes, int dislikes, int reply_number, String sort) {
        this.b_id = b_id;
        this.author = author;
        this.uid = uid;
        this.title = title;
        this.content = content;
        this.create_time = create_time;
        this.likes = likes;
        this.dislikes = dislikes;
        this.reply_number = reply_number;
        this.sort = sort;
    }

    public Blog(String author, int uid, String title, String content, String create_time, int likes, int dislikes, int reply_number, String sort) {
        this.author = author;
        this.uid = uid;
        this.title = title;
        this.content = content;
        this.create_time = create_time;
        this.likes = likes;
        this.dislikes = dislikes;
        this.reply_number = reply_number;
        this.sort = sort;
    }

    public Blog() {
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getReply_number() {
        return reply_number;
    }

    public void setReply_number(int reply_number) {
        this.reply_number = reply_number;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "b_id=" + b_id +
                ", author='" + author + '\'' +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", create_time='" + create_time + '\'' +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", reply_number=" + reply_number +
                ", sort='" + sort + '\'' +
                '}';
    }
}
