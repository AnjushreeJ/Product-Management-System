package com.palle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.palle.entity.Product;

// @Repository - used to interact with database
public interface ProductRepository extends JpaRepository<Product, Integer> {

}