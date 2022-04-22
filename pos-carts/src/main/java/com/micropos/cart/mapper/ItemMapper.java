package com.micropos.cart.mapper;

import com.micropos.cart.model.Item;
import com.micropos.dto.CartItemDto;

import java.util.Collection;

public interface ItemMapper {

    Collection<CartItemDto> toCartItemsDto(Collection<Item> items);

    Collection<Item> toItems(Collection<CartItemDto> cartItemDtos);

    Item toItem(CartItemDto cartItemDto);

    CartItemDto toCartItemDto(Item item);

}
