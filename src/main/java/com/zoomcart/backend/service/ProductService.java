package com.zoomcart.backend.service;

import com.zoomcart.backend.repository.ProductRepository;
import com.zoomcart.controller.ProductApiDelegate;
import com.zoomcart.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductApiDelegate {
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<Product> addProduct(Product product) {
        return null;
    }
}
