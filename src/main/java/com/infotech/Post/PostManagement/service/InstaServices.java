package com.infotech.Post.PostManagement.service;

import com.infotech.Post.PostManagement.controller.LoginRequest;
import com.infotech.Post.PostManagement.entity.Post;
import com.infotech.Post.PostManagement.entity.User;

import java.util.List;


public interface InstaServices {

    public String saveUser(User user);

    public List<User> fetchUser();

    public Object login(LoginRequest loginRequest) throws Exception;

    public String update(Integer id, String pass, User user);

    public String delete(Integer id, String pass);

    public String savePost(Post post);

    public List<Post> fetchPost();

    public abstract String deletePost(Integer postId, Integer userId);

    Object fetchByPostId(Integer postId);

    List<Post> fetchByUserId(Integer userId);

    String updatePost(Integer postId, Post post);

    String deletePostByUserId(Integer userId);
}
