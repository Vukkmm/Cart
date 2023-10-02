package com.example.Cart.controller;

import com.example.Cart.entity.Product;
import com.example.Cart.service.CartService;
import com.example.Cart.service.ProductServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/carts")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping
    public ResponseEntity<String> addToCart(@PathVariable Long userId, @PathVariable Long productId) {
        cartService.addToCart(userId, productId);
        return ResponseEntity.ok("Product da duoc them thanh cong");
    }

    private final ProductServiceClient productServiceClient;


    @GetMapping("{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        Product product = productServiceClient.getProductById(id);
        return ResponseEntity.ok().body(product);
    }

}
