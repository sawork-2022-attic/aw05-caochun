package com.micropos.cart.model;

import com.micropos.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
public class Item implements Serializable {
    private ProductDto product;
    private int quantity;
}
