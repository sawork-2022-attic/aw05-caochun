package com.micropos.cart.service;

import com.micropos.cart.model.Cart;
import com.micropos.cart.model.Item;

import java.util.List;

public interface CartService {

    void checkout(Cart cart);

    Cart add(Cart cart, Item item);

    List<Cart> getAllCarts();

    Cart getCart(String cartId);

}
