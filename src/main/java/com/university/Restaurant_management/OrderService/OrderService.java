package com.university.Restaurant_management.OrderService;

import com.university.Restaurant_management.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public  List<Order> getAllOrder(){
        return orderRepository.findAll();
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public Order UpadteOrder(Long idCommand , Order OrderDetails){
        Order order = orderRepository.findById(idCommand)
                .orElseThrow(()-> new ResourceNotFoundException("Order not found"));

        order.setNameCommand(OrderDetails.getNameCommand());
        order.setPrixCommand(OrderDetails.getPrixCommand());
        order.setFraisLivraison(OrderDetails.getFraisLivraison());
        return orderRepository.save(order);

    }

    public void deleteOrder(Long idCommand){
        Order order = orderRepository.findById(idCommand)
                .orElseThrow(()-> new ResourceNotFoundException("Order not found"));

        orderRepository.delete(order);
    }


}
