package com.project.orderserviceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.orderserviceapi.entity.Order;
import com.project.orderserviceapi.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}


	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}
	

}
