package com.micropos.cart.mapper;

import com.micropos.cart.model.Cart;
import com.micropos.cart.model.Item;
import com.micropos.dto.CartDto;
import com.micropos.dto.CartItemDto;

import java.util.Collection;

public interface CartMapper {
    Collection<CartDto> toCartDtos(Collection<Cart> carts);

    Collection<Cart> toCarts(Collection<CartDto> cartDtos);

    Cart toCart(CartDto cartDto);

    CartDto toCartDto(Cart cart);
}
