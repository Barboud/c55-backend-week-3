package com.pizzacompany.enums;

public enum Topping {
    CHEESE(1.00),
    MUSHROOMS(1.50),
    PEPPERONI(2.00),
    OLIVES(1.00),
    PINEAPPLE(1.50);

    private final double price;

    Topping(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
