package com.example.demo3.Services;

import com.example.demo3.Models.Product;
import com.example.demo3.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    public Product updateProduct(Product product) {
        return productRepository.saveAndFlush(product);

    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
