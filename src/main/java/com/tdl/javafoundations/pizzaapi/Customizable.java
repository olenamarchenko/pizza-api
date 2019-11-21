package com.tdl.javafoundations.pizzaapi;

import java.util.List;

public interface Customizable {

    void addIngredient(Ingredient ingredient);
    void removeIngredient(Ingredient ingredient);
    List<Ingredient> getIngredients();
}
