package com.matheus.custodio.projeto.repositories;

import com.matheus.custodio.projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
