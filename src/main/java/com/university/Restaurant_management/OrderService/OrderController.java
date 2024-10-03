package com.university.Restaurant_management.OrderService;

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

    @PostMapping ("/AddOrder")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrder(){
        List<Order>  order = orderService.getAllOrder();
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PutMapping("/{idCommand}")

    public Order UpdateOrder(@PathVariable Long idCommand, @RequestBody Order orderDetails) {
        return orderService.UpadteOrder(idCommand, orderDetails);
    }

    @DeleteMapping("/{idCommand}")

    public ResponseEntity<?> deleteOrder(@PathVariable Long idCommand ){
        orderService.deleteOrder(idCommand);
        return ResponseEntity.ok().build();
    }
}
