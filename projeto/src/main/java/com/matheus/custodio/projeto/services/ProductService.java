package com.matheus.custodio.projeto.services;

import com.matheus.custodio.projeto.entities.Product;
import com.matheus.custodio.projeto.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findByid(Long id){
        Optional<Product> Product = productRepository.findById(id);
        return Product.get();
    }
}
