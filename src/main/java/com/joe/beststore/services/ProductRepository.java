package com.joe.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joe.beststore.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>  {
    
}
