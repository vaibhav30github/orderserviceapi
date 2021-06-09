package com.project.orderserviceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.orderserviceapi.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
