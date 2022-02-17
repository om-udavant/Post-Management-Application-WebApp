package com.infotech.Post.PostManagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "postId")
    private Integer postId;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "password")
    private String password;

    @Column(name = "postName")
    private String postName;

    @Column(name = "postTopic")
    private String postTopic;

    @Column(name = "postDescription")
    private String postDescription;

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

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostTopic() {
        return postTopic;
    }

    public void setPostTopic(String postTopic) {
        this.postTopic = postTopic;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Post(Integer userId, Integer postId, String password, String postName, String postTopic, String postDescription) {
        this.userId = userId;
        this.postId = postId;
        this.password = password;
        this.postName = postName;
        this.postTopic = postTopic;
        this.postDescription = postDescription;
    }

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", postId=" + postId +
                ", password='" + password + '\'' +
                ", postName='" + postName + '\'' +
                ", postTopic='" + postTopic + '\'' +
                ", postDescription='" + postDescription + '\'' +
                '}';
    }
}
