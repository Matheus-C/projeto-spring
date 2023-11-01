package com.matheus.custodio.projeto.repositories;

import com.matheus.custodio.projeto.entities.OrderItem;
import com.matheus.custodio.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
