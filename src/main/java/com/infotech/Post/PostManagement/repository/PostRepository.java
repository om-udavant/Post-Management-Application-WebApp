package com.infotech.Post.PostManagement.repository;

import com.infotech.Post.PostManagement.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
     String s = "Hii";

     void deleteByPostIdAndUserId(int postId, int userId);

     Post findByPostId(Integer postId);

     List<Post> findByUserId(Integer userId);

     void deletePostByUserId(Integer userId);

}
