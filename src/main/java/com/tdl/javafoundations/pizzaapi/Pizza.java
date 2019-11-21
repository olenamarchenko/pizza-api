package com.tdl.javafoundations.pizzaapi;

import java.math.BigDecimal;
import java.util.*;

public class Pizza implements ProductInfo, Priceable, Customizable {

    private List<Ingredient> ingredientList = new ArrayList<Ingredient>();
    private BigDecimal price;
    private String productInfo;


    public Pizza(String productInfo, BigDecimal price){
        productInfo=this.productInfo;
        price=this.price;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        ingredientList.remove(ingredient);
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredientList;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getProductInfo() {
        return productInfo;
    }
}
