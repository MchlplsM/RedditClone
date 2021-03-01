package com.example.RedditClone.repository;

import com.example.RedditClone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                     //extends keyword indicates a class is inherited from another class
public interface PostRepository extends JpaRepository<Post, Long> {
}