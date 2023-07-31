package com.springboot.product_category.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.product_category.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
