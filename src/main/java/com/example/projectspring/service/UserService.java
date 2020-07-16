package com.example.projectspring.service;

import com.example.projectspring.domain.User;
import java.util.List;
import java.util.Optional;

import com.example.projectspring.dto.UserDTO;
import com.example.projectspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public User fromDTO(UserDTO objTto) {
        return new User(objTto.getId(), objTto.getName(), objTto.getEmail());
    }

}
