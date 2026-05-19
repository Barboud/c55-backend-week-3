package com.pizzacompany.enums;

public enum Size {
    SMALL(6),
    MEDIUM(9),
    LARGE(12)
    ;

    private final Integer price;

    Size(int price) {
        this.price = price;
    }

    public Integer getBasePrice(){
        return price;
    }
}
