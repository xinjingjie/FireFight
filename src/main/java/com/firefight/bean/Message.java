package com.firefight.bean;
//留言
public class Message {
    //id
    private int m_id;
    //昵称
    private String name;
    //标题
    private String title;
    //内容
    private String content;
    //联系方式
    private String telephone;
    //住址
    private String location;
    //创建时间
    private String create_time;

    @Override
    public String toString() {
        return "Message{" +
                "m_id=" + m_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", telephone='" + telephone + '\'' +
                ", location='" + location + '\'' +
                ", create_time='" + create_time + '\'' +
                '}';
    }

    public Message(int m_id, String name, String title, String content, String telephone, String location, String create_time) {
        this.m_id = m_id;
        this.name = name;
        this.title = title;
        this.content = content;
        this.telephone = telephone;
        this.location = location;
        this.create_time = create_time;
    }

    public Message() {
    }

    public Message(String name,String title, String content, String telephone, String location, String create_time) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.telephone = telephone;
        this.location = location;
        this.create_time = create_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
