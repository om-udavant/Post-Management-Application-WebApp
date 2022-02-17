package com.infotech.Post.PostManagement.controller;

public class LoginRequest {
    private Integer userId;
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                '}';
    }
}
