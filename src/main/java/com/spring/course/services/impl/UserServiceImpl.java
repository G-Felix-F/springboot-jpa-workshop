package com.spring.course.services.impl;

import com.spring.course.entities.User;
import com.spring.course.repositories.UserRepository;
import com.spring.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(RuntimeException::new);
    }
}
