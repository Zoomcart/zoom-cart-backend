package com.zoomcart.backend.model.mapper;

import com.zoomcart.backend.model.entity.ProductEntity;
import com.zoomcart.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductEntity createProductEntityFromDTO(Product product) {
        ProductEntity.builder()
            .name(product.getName())
            .build();
        return null;
    }
}
