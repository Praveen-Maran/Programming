package com.boot.controller;

import com.boot.model.ProductItem;
import com.boot.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;
    @PostMapping("/saveProduct")
    public ProductItem productItem(@RequestBody ProductItem productItem){
        return productRepo.save(productItem);
    }

    @GetMapping("/search/{productId}")
    public ProductItem productItem(@PathVariable String productId ){
        return productRepo.findById(productId);
    }
}
