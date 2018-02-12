package com.chrismalloy;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String breadType, String meat, double price, String name) {
        super(breadType, meat, price, name);
    }

    private boolean chipsAndDrink = true;

    @Override
    public void addAddition(String name) {
        System.out.println("Extra additions not allowed on deluxe burger.");
    }
}
