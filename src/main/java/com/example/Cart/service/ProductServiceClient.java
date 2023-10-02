package com.example.Cart.service;


import com.example.Cart.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient( name = "Products")
public interface ProductServiceClient {
       @GetMapping("http://localhost:8991/api/v1/products/{id}")
       Product getProductById(@PathVariable Long id);

}






















































