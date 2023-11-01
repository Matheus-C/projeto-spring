package com.matheus.custodio.projeto.services;

import com.matheus.custodio.projeto.entities.Category;
import com.matheus.custodio.projeto.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findByid(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
