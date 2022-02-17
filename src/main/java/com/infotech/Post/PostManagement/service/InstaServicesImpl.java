package com.infotech.Post.PostManagement.service;

import com.infotech.Post.PostManagement.controller.LoginRequest;
import com.infotech.Post.PostManagement.entity.Post;
import com.infotech.Post.PostManagement.entity.User;
import com.infotech.Post.PostManagement.repository.PostRepository;
import com.infotech.Post.PostManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class InstaServicesImpl implements InstaServices {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public String saveUser(User user) {
        userRepository.save(user);
        return "User Added";
    }

    @Override
    public List<User> fetchUser() {

        return userRepository.findAll();
    }

    @Override
    public Object login(LoginRequest loginRequest) throws Exception {

        User user = userRepository.findByUserId(loginRequest.getUserId());

        if (loginRequest.getPassword().equals(user.getPassword())) {
            return userRepository.findByUserId(loginRequest.getUserId());

        } else {
            throw new Exception("Invalid user");
        }
    }


    @Override
    public String update(Integer id, String pass, User user) {

        User user1 = userRepository.findByUserId(id);

        if (user1.getPassword().equals(pass)) {

            user1.setUserName(user.getUserName());
            user1.setPassword(user.getPassword());
            userRepository.save(user1);

            return "User Info Updated";

        } else {
            return "You are not the vaild user.";
        }

    }

    @Override
    public String delete(Integer id, String pass) {

        User user = userRepository.findByUserId(id);

        if (user.getPassword().equals(pass)) {

            userRepository.deleteById(id);

            return "User is deleted Successfully.";

        } else {

            return "Check Your Id and Password.";
        }

    }

    @Override
    public String savePost(Post post) {
        postRepository.save(post);
        return "Post added";
    }

    @Override
    public List<Post> fetchPost() {
        return postRepository.findAll();
    }

    @Override
    @Transactional
    public String deletePost(Integer postId, Integer userId) {

        String s = postRepository.s;

        System.out.println(s);

        postRepository.deleteByPostIdAndUserId(postId, userId);

        return "Post deleted by User Id.";
    }

    @Override
    public Object fetchByPostId(Integer postId) {

        return postRepository.findByPostId(postId);
    }

    @Override
    public List<Post> fetchByUserId(Integer userId) {
        return postRepository.findByUserId(userId);
    }

    @Override
    public String updatePost(Integer postId, Post post) {

        Post post1 = postRepository.findByPostId(postId);

        post1.setPostName(post.getPostName());
        post1.setPostDescription(post.getPostDescription());
        post1.setPostTopic(post.getPostTopic());

        postRepository.save(post1);

        return "Post Updated";
    }

    @Override
    public String deletePostByUserId(Integer userId) {


        while(postRepository.existsById(userId)){
            postRepository.deletePostByUserId(userId);
        }
        return "Post Deleted by UserId";
    }


}
