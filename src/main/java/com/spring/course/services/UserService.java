package com.spring.course.services;

import com.spring.course.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);
}
