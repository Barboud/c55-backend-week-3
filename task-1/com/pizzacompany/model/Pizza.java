package com.pizzacompany.model;

import com.pizzacompany.enums.Size;
import com.pizzacompany.enums.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final Size size;
    private List<Topping> toppingList = new ArrayList<>();

    public Pizza(Size size, List<Topping> toppingList) {
        this.size = size;
        this.toppingList = toppingList;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public Size getSize() {
        return size;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Topping topping : toppingList) {
            totalPrice += topping.getPrice();
        }
        totalPrice += size.getBasePrice();
        return totalPrice;
    }

    @Override
    public String toString() {
        // MEDIUM pizza with [CHEESE, MUSHROOMS] - €11.50
        return  size + " pizza with " + toppingList + " - €" + String.format(" - €%.2f", getTotalPrice());
    }

}
