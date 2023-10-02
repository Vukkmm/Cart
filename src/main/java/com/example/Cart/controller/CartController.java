package com.example.Cart.controller;

import com.example.Cart.service.CartService;
import com.example.Cart.service.ProductServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/carts")
public class CartController {
    @Autowired
    CartService cartService;

//    @PostMapping
//    public ResponseEntity<String> addToCart(@PathVariable Long userId, @PathVariable Long productId) {
//        cartService.addToCart(userId, productId);
//        return ResponseEntity.ok("Product da duoc them thanh cong");
//    }

    private final ProductServiceClient productServiceClient;

    @Autowired
    public CartController(ProductServiceClient productServiceClient) {
        this.productServiceClient = productServiceClient;
    }

    @GetMapping
    public ResponseEntity<Object> getProduct(@PathVariable Long id) {
        return ResponseEntity.ok().body(productServiceClient.getProductById(id));
    }

}
