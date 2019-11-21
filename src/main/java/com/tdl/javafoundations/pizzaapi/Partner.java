package com.tdl.javafoundations.pizzaapi;

import java.util.List;

public class Partner {

    private Menu menu;

    private List<MenuItem> reviewMenu(){
        return menu.getMenuItemsList();
    }
}
