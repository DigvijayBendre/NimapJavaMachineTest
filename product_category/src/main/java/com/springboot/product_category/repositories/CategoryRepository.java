package com.springboot.product_category.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.product_category.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
