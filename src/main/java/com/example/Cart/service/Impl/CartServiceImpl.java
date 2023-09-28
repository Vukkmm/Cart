package com.example.Cart.service.Impl;

import com.example.Cart.entity.Cart;
import com.example.Cart.repository.CartRepository;
import com.example.Cart.service.CartService;
import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    RestTemplate restTemplate;

    @Override
    public void addToCart(Long userid, Long productId) {
        Cart cart = new Cart();
        cart.setUserId(userid);
        cart.setProductId(productId);
        cartRepository.save(cart);
    }
}
