package com.university.Restaurant_management.Service;

import com.university.Restaurant_management.Entity.Order;
import com.university.Restaurant_management.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public  OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public  List<Order> getAllOrder(){
        return orderRepository.findAll();
    }


    public Order createOrder(Order order){
        return orderRepository.save(order);
    }


}
