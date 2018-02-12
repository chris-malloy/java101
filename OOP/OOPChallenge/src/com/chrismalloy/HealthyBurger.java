package com.chrismalloy;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price, String name) {
        super("Whole wheat", meat, price, name);
    }

    private boolean spinach;
    private boolean mushrooms;

    @Override
    public void addAddition(String name) {
        if ("lettuce".equals(name)) {
            this.additionsTotal += 0.20;
            this.lettuce = true;
        } else if ("tomato".equals(name)) {
            this.additionsTotal += 0.30;
            this.tomato = true;
        } else if ("onion".equals(name)) {
            this.additionsTotal += 0.15;
            this.onion = true;
        } else if ("ketchup".equals(name)) {
            this.additionsTotal += 0.10;
            this.ketchup = true;
        } else if ("spinach".equals(name)) {
            this.additionsTotal += 1.0;
            this.spinach = true;
        } else if ("mushrooms".equals(name)){
            this.additionsTotal += 0.90;
            this.mushrooms = true;
        } else {
            System.out.println("Please add either lettuce, tomato, onion, ketchup, spinach, or mushrooms.");
        }
        System.out.println(name + " was added.");
        this.additions += 1;
    }
}
