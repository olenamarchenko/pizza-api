package com.tdl.javafoundations.pizzaapi;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<BasketItem> basketItems = new ArrayList<>();
    private Deal deal;
    private int total;

    public void addItem(BasketItem basketItem){
        basketItems.add(basketItem);
    }

    public void removeItem(BasketItem basketItem){
        basketItems.remove(basketItem);
    }

    public Deal getDeal() {
        return deal;
    }

    public int getTotal() {
        return total;
    }

    public List<BasketItem> getItems(){
        return basketItems;
    }

    public void placeOrder(){
        //TODO implement me
    }
}
