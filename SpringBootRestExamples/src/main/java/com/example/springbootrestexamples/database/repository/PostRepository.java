package com.example.springbootrestexamples.database.repository;

import com.example.springbootrestexamples.database.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}