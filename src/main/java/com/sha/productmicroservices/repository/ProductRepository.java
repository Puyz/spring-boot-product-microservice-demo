package com.sha.productmicroservices.repository;

import com.sha.productmicroservices.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
