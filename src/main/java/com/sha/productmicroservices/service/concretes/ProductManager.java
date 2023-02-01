package com.sha.productmicroservices.service.concretes;

import com.sha.productmicroservices.model.Product;
import com.sha.productmicroservices.repository.ProductRepository;
import com.sha.productmicroservices.service.abstracts.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }

}
