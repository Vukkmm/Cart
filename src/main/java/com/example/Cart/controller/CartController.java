package com.example.Cart.controller;

import com.example.Cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/carts")
public class CartController {
    @Autowired
    CartService cartService;
    @PostMapping
    public ResponseEntity<String> addToCart(@PathVariable Long userId, @PathVariable Long productId) {
        cartService.addToCart(userId, productId);
        return ResponseEntity.ok("Product da duoc them thanh cong");
    }
}
