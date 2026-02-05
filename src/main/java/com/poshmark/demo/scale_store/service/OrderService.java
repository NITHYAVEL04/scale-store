package com.poshmark.demo.scale_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poshmark.demo.exception.ProductNotFoundException;
import com.poshmark.demo.model.Product;
import com.poshmark.demo.repository.ProductRepository;

import jakarta.annotation.Nonnull;

@Service
public class OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
   public String processOrder(@Nonnull Long productId) {
        @SuppressWarnings("null")
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + productId));

        if (product.getStock() <= 0) {
            return "Sold Out";
        }

        product.setStock(product.getStock() - 1);
        productRepository.save(product);

        return "Purchase successful for " + product.getName();


    }
}
