package com.boot.repository;

import com.boot.model.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductItem, Long> {
    ProductItem findById(String productId);
}
