package com.zoomcart.backend.model.mapper;

import com.zoomcart.backend.model.entity.ProductEntity;
import com.zoomcart.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    /**
     * Creates a ProductEntity object from a given Product object.
     *
     * @param  product  the Product object to create the ProductEntity from
     * @return          the created ProductEntity object
     */
    public ProductEntity createProductEntityFromDTO(Product product) {
        return ProductEntity.builder()
            .name(product.getName())
            .description(product.getDescription())
            .price(product.getPrice())
            .quantityUnit(product.getQuantityUnit())
            .isAvailable(product.getIsAvailable())
            .imageUrl(product.getImageUrl())
            .build();
    }

    public Product getProductDTOFromProductEntity(ProductEntity productEntity) {
        Product productDTO = new Product();
        productDTO.setProductId(productEntity.getProductId());
        productDTO.setName(productEntity.getName());
        productDTO.setDescription(productEntity.getDescription());
        productDTO.setPrice(productEntity.getPrice());
        productDTO.setQuantityUnit(productEntity.getQuantityUnit());
        productDTO.setIsAvailable(productEntity.getIsAvailable());
        productDTO.setImageUrl(productEntity.getImageUrl());
        return productDTO;
    }
}
