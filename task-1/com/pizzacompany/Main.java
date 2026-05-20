package com.pizzacompany;


import com.pizzacompany.enums.Size;
import com.pizzacompany.enums.Topping;
import com.pizzacompany.model.Order;
import com.pizzacompany.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        List<Topping> toppingsFirstPizza = new ArrayList<>();
        toppingsFirstPizza.add(Topping.CHEESE);
        toppingsFirstPizza.add(Topping.MUSHROOMS);

        Pizza pizza1 = new Pizza(Size.MEDIUM, toppingsFirstPizza);
        order.addPizza(pizza1);

        List<Topping> toppingsSecondPizza = new ArrayList<>();
        toppingsSecondPizza.add(Topping.PINEAPPLE);
        toppingsSecondPizza.add(Topping.OLIVES);
        toppingsSecondPizza.add(Topping.CHEESE);

        Pizza pizza2 = new Pizza(Size.LARGE, toppingsSecondPizza);
        order.addPizza(pizza2);

        List<Topping> toppingsThirdPizza = new ArrayList<>();
        toppingsThirdPizza.add(Topping.PINEAPPLE);

        Pizza pizza3 = new Pizza(Size.SMALL, toppingsThirdPizza);
        order.addPizza(pizza3);

        order.printReceipt();
    }
}