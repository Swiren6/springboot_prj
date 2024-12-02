package com.example.demo3.Services;


import com.example.demo3.Models.Order;
import com.example.demo3.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);

    }
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }
}
