package com.example.Cart.service;


import com.example.Cart.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient( name = "Products", url = "http://localhost:8991/api/v1/products")
public interface ProductServiceClient {
       @GetMapping("{id}")
       Product getProductById(@PathVariable Long id);

}






















































