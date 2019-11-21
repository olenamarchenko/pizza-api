package com.tdl.javafoundations.pizzaapi;

import java.math.BigDecimal;

public class BasketItem implements Priceable{

    private BigDecimal price;
    private int quantity;
    private MenuItem menuItem;

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
}
