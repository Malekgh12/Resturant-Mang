package com.university.Restaurant_management.Controller;

import com.university.Restaurant_management.Entity.Order;
import com.university.Restaurant_management.Repository.OrderRepository;
import com.university.Restaurant_management.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

    @PostMapping ("/AddOrder")
    public Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrder(){
        List<Order>  order = orderService.getAllOrder();
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
