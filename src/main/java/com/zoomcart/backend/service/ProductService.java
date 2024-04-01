package com.zoomcart.backend.service;

import com.zoomcart.backend.model.entity.ProductEntity;
import com.zoomcart.backend.model.mapper.ProductMapper;
import com.zoomcart.backend.repository.ProductRepository;
import com.zoomcart.controller.ProductApiDelegate;
import com.zoomcart.model.Product;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductApiDelegate {
    private ProductRepository productRepository;
    private ProductMapper productMapper;

    @Override
    public ResponseEntity<Product> addProduct(Product product) {
        ProductEntity productEntity = productMapper.createProductEntityFromDTO(product);
        ProductEntity savedProductEntity = productRepository.save(productEntity);
        return ResponseEntity.ok(productMapper.getProductDTOFromProductEntity(savedProductEntity));
    }

    @Override
    public ResponseEntity<List<Product>> getProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        return ResponseEntity.ok(null);
    }
}
