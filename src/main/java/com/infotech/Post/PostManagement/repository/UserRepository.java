package com.infotech.Post.PostManagement.repository;

import com.infotech.Post.PostManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(Integer userId);

    void deleteById(Integer id);


//    User findById(List id);
}
