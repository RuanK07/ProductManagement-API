package com.ruankennedy.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruankennedy.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
