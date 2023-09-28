package com.example.Cart.service;

import com.example.Cart.entity.Cart;

public interface CartService {
   void addToCart(Long userid, Long productId);
}
