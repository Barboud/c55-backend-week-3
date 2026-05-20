package com.pizzacompany.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Pizza> pizzas;

    public Order() {
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getTotalPrice();
        }
        return total;
    }

    public void printReceipt(){
        System.out.println("=== Receipt ===");

        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }

        System.out.println("---------------");
        System.out.println("Total: €" + String.format("€%.2f", getTotalPrice()));
    }
}
