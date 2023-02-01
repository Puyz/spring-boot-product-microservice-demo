package com.sha.productmicroservices.service.abstracts;

import com.sha.productmicroservices.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAll();
}
