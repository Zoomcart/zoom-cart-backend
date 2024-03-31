package com.zoomcart.backend.service;

import com.zoomcart.controller.ProductApiDelegate;
import com.zoomcart.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductApiDelegate {

    @Override
    public ResponseEntity<Product> addProduct(Product product) {
        return null;
    }
}
