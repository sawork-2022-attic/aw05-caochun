package com.micropos.cart.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Cart implements Serializable {


    private Long id;

    private List<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        return items.add(item);
    }

}
