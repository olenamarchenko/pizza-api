package com.tdl.javafoundations.pizzaapi;

import java.math.BigDecimal;

public class MenuItem implements Priceable, DeepComparable<MenuItem> {

    private String id;
    private Product product;

    public MenuItem(Product product, String id) {
        this.product = product;
        this.id = id;
    }

    @Override
    public BigDecimal getPrice() {
        return product.getPrice();
    }

    @Override
    public boolean deepequals(MenuItem other) {
        return getPrice() == other.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public String getName() {
        return product.getProductInfo();
    }
}
