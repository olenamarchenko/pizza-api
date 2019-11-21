package com.tdl.javafoundations.pizzaapi;

import java.math.BigDecimal;

public class Product implements Priceable, ProductInfo{

    private BigDecimal price;
    private String productInfo;
    private Api api;

    public Product(Api api, String productInfo){
        this.productInfo = productInfo;
    }

    @Override
    public String getProductInfo() {
        return productInfo;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
