package com.firefight.bean;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;
    private String username;
    private String gender;
    private String password;
    private String telephone;
    private String identify;
    @Override
    public String toString() {
        return "User{" +
                "id=" + uid +
                ", name='" + username + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public User(int id, String username, String gender, String password, String telephone, String identify) {
        this.uid = id;
        this.username = username;
        this.gender = gender;
        this.password = password;
        this.telephone = telephone;
        this.identify = identify;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
}
