package com.spring.course.services;

import com.spring.course.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(Long id);
}
