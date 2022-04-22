package com.micropos.cart.rest;

import com.micropos.api.CartsApi;
import com.micropos.dto.CartDto;
import com.micropos.dto.CartItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController implements CartsApi {


    @Override
    public ResponseEntity<CartDto> addItemToCart(String cartId, CartItemDto cartItemDto) {
        return CartsApi.super.addItemToCart(cartId, cartItemDto);
    }

    @Override
    public ResponseEntity<CartDto> createCart(CartDto cartDto) {
        return CartsApi.super.createCart(cartDto);
    }

    @Override
    public ResponseEntity<List<CartDto>> listCarts() {
        return CartsApi.super.listCarts();
    }

    @Override
    public ResponseEntity<CartDto> showCartById(String cartId) {
        return CartsApi.super.showCartById(cartId);
    }

    @Override
    public ResponseEntity<Double> showCartTotal(String cartId) {
        return CartsApi.super.showCartTotal(cartId);
    }
}
