package com.firefight.bean;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;
    private String username;
    private String gender;
    private String password;
    private String telephone;
    private String identify;
    private String profile_id;
    private String location;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", identify='" + identify + '\'' +
                ", profile_id='" + profile_id + '\'' +
                ", location='" + location + '\'' +
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

    public String getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(String profile_id) {
        this.profile_id = profile_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User(int id, String username, String gender, String password, String telephone, String identify, String profile_id, String location) {
        this.uid = id;
        this.username = username;
        this.gender = gender;
        this.password = password;
        this.telephone = telephone;
        this.identify = identify;
        this.profile_id = profile_id;
        this.location = location;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
}
