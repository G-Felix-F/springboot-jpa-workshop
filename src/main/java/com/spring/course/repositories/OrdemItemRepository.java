package com.spring.course.repositories;

import com.spring.course.entities.Category;
import com.spring.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {

}
