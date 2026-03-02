package com.spring.course.services;

import com.spring.course.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category findById(Long id);
}
