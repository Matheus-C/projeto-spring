package com.matheus.custodio.projeto.services;

import com.matheus.custodio.projeto.entities.Order;
import com.matheus.custodio.projeto.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findByid(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }
}
