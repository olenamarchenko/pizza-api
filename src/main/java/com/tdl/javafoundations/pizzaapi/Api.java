package com.tdl.javafoundations.pizzaapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Api {

    public static void main(String[] args){
        Api api = new Api();
        System.out.println("Available Pizzas: ");
        api.displayPizzas();
        System.out.println("\nSides: ");
        api.displayMenu();
    }

    public Menu getMenu(int partnerId){
        // some function to provide menu is present (SQL query/HTTP request here in a real implementation)
        Menu menu = new Menu(this,"Some menu");
        return menu;
    }

    private void displayMenu() {
        for(MenuItem aMenuItem : menu.getMenuItemsList()){
            System.out.println(aMenuItem.getName());
        }
    }

    private void displayPizzas() {
        for(Pizza aPizza : pizzas){
            System.out.println(aPizza.getProductInfo());
        }
    }

    private List<Pizza> pizzas = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private Api api;
    private Menu menu = new Menu(api, "SeanPizzaShop");

    public Api(){
        populatePizzas();
        populateProducts();
        createMenu();
    }

    private void createMenu(){
        int count = 0;
        for (Product product : products) {
            count++;
            menu.addMenuItem(new MenuItem(product, (count + "")));
        }
    }

    private void populatePizzas(){
        Ingredient cheese = new Ingredient("cheese", new BigDecimal(2));
        Ingredient ham = new Ingredient("ham", new BigDecimal(3));
        Ingredient chicken = new Ingredient("chicken", new BigDecimal(4));
        Ingredient peppers = new Ingredient("peppers", new BigDecimal(2));
        Ingredient sausage = new Ingredient("sausage", new BigDecimal(3));

        Pizza cheesePizza = new Pizza("Cheese Pizza",new BigDecimal( 6));
        cheesePizza.addIngredient(cheese);
        pizzas.add(cheesePizza);

        Pizza hamPizza = new Pizza("Ham Pizza", new BigDecimal(6));
        hamPizza.addIngredient(cheese);
        hamPizza.addIngredient(ham);
        pizzas.add(hamPizza);

        Pizza chickenPizza = new Pizza("Chicken Pizza", new BigDecimal(6));
        chickenPizza.addIngredient(cheese);
        chickenPizza.addIngredient(chicken);
        pizzas.add(chickenPizza);

        Pizza hamPepperPizza = new Pizza("Ham and Pepper Pizza", new BigDecimal(7));
        hamPepperPizza.addIngredient(cheese);
        hamPepperPizza.addIngredient(ham);
        hamPepperPizza.addIngredient(peppers);
        pizzas.add(hamPepperPizza);

        Pizza theWorks = new Pizza("The Works Pizza", new BigDecimal(10));
        theWorks.addIngredient(cheese);
        theWorks.addIngredient(ham);
        theWorks.addIngredient(peppers);
        theWorks.addIngredient(chicken);
        theWorks.addIngredient(sausage);
        pizzas.add(theWorks);
    }

    private void populateProducts(){
        products.add(new Product(api, "Chips" ));
        products.add(new Product(api, "Rice"));
        products.add(new Product(api, "Vegetables"));
        products.add(new Product(api, "Curry"));
        products.add(new Product(api, "Gravy"));
        products.add(new Product(api, "Coffee"));
        products.add(new Product(api, "Cola"));
    }

}
