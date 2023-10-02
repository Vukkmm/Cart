package com.example.Cart.service.Impl;

import com.example.Cart.entity.Cart;
import com.example.Cart.repository.CartRepository;
import com.example.Cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;

    @Override
    public void addToCart(Long userid, Long productId) {
        Cart cart = new Cart();
        cart.setUserId(userid);
        cart.setProductId(productId);
        cartRepository.save(cart);
    }

}
