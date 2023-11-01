package com.matheus.custodio.projeto.repositories;

import com.matheus.custodio.projeto.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
