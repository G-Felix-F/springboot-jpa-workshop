package com.spring.course.services.impl;

import com.spring.course.entities.Order;
import com.spring.course.repositories.OrderRepository;
import com.spring.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(RuntimeException::new);
    }
}
