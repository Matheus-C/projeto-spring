package com.matheus.custodio.projeto.repositories;

import com.matheus.custodio.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
