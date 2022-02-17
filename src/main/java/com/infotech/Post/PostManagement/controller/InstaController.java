package com.infotech.Post.PostManagement.controller;


import com.infotech.Post.PostManagement.entity.Post;
import com.infotech.Post.PostManagement.entity.User;
import com.infotech.Post.PostManagement.service.InstaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/insta")
public class InstaController {

    @Autowired
    private InstaServices instaServices;// = new InstaServicesImpl();


    @GetMapping("/health")
    public String healthCheck() {
        return "I am alive ✔.";
    }

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user) {

        return instaServices.saveUser(user);
    }

    @GetMapping("/user")
    public List<User> fetchUser() {
        return instaServices.fetchUser();
    }

    @PostMapping("/userId")
    public Object login(@RequestBody LoginRequest loginRequest) throws Exception {

        return instaServices.login(loginRequest);
    }


    @PutMapping("/user/{id}/{pass}")
    public String update(@PathVariable("id") Integer id, @PathVariable("pass") String pass, @RequestBody User user) {

        return instaServices.update(id, pass, user);
    }

    @DeleteMapping("/user/{id}/{pass}")
    public String delete(@PathVariable Integer id, @PathVariable String pass) {

        return instaServices.delete(id, pass);
    }

    @PostMapping("/addPost")
    public String savePost(@RequestBody Post post) {

        return instaServices.savePost(post);
    }

    @GetMapping("/post")
    public List<Post> fetchPost() {
        return instaServices.fetchPost();
    }

    @DeleteMapping("/post/{postId}/{userId}")
    public String deletePost(@PathVariable Integer postId, @PathVariable Integer userId){

        return instaServices.deletePost(postId, userId);
    }

    @GetMapping("/postId/{postId}")
    public Optional<Post> fetchByPostId(@PathVariable("postId") Integer postId )
    {
       return (Optional<Post>) instaServices.fetchByPostId(postId);
    }

    @GetMapping("/userId/{userId}")
    public List<Post> fetchByUserId(@PathVariable("userId") Integer userId){
        return instaServices.fetchByUserId(userId);
    }

    @PutMapping("/post/{postId}")
    public String updatePost(@PathVariable("postId") Integer postId, @RequestBody Post post){
        return instaServices.updatePost(postId, post);
    }

    @DeleteMapping("/userId/{userId}")
    public String deletePostByUserId(@PathVariable("userId") Integer userId){
        return instaServices.deletePostByUserId(userId);
    }

}
