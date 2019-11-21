package com.tdl.javafoundations.pizzaapi;

import java.math.BigDecimal;

public class Ingredient implements Priceable, ProductInfo {

    private BigDecimal price;
    private String productInfo;

    public Ingredient(String productInfo, BigDecimal price){
        this.productInfo = productInfo;
        this.price = price;
    }

    @Override
    public String getProductInfo() {
        return productInfo;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
