package com.example.projectspring.service;

import com.example.projectspring.domain.Post;
import com.example.projectspring.domain.User;
import com.example.projectspring.dto.UserDTO;
import com.example.projectspring.exception.ObjectNotFoundException;
import com.example.projectspring.repository.PostRepository;
import com.example.projectspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitle(text);
    }

}
