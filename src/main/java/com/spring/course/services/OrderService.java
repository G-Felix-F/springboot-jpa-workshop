package com.spring.course.services;

import com.spring.course.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();

    Order findById(Long id);
}
