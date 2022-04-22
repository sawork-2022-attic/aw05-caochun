package com.micropos.cart.model;

import com.micropos.dto.ProductDto;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;


@Data
public class Item implements Serializable {
    @Id
    private Long id;
    private ProductDto product;
    private int quantity;
}
