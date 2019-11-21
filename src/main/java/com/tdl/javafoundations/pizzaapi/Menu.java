package com.tdl.javafoundations.pizzaapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Menu {

    private List<MenuItem> menuItems = new ArrayList<>();
    private List<Deal> deals = new ArrayList<>();
    private String description;
    private Api api;

    public Menu(Api api, String description){
        this.api = api;
        this.description = description;
    }

    public List<MenuItem> getMenuItemsList() {
        return menuItems;
    }
    public List<Deal> getDeals() {
        return deals;
    }

    public String getDescription() {
        return description;
    }

    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

}
