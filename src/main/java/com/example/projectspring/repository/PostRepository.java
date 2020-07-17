package com.example.projectspring.repository;

import com.example.projectspring.domain.Post;
import com.example.projectspring.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
