    package com.example.Cart.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Products", url = "http://localhost:8991/Products")
public interface ProductServiceClient {
//        @GetMapping("/api/v1/products/{id}")
//        ResponseEntity<Product> getProductById(@PathVariable("id") Long id);

}






















































