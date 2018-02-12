package com.chrismalloy;

public class Hamburger {
    private String breadType;
    private String meat;
    private double price;
    public double additionsTotal;
    private String name;
    public int additions;
    public boolean lettuce;
    public boolean tomato;
    public boolean onion;
    public boolean ketchup;

    public Hamburger(String breadType, String meat, double price, String name) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
        this.name = name;
        this.additionsTotal = 0;
    }

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
        } else {
            System.out.println("Please add either lettuce, tomato, onion, or ketchup.");
        }
        System.out.println(name + " was added.");
        this.additions += 1;
    }

    public String calcPrice(){
        double totalPrice = this.additionsTotal + this.price;

        return "The base price for this order is: " + this.price + ".\n" +
                "There were " + this.additions + " additions totaling: " + this.additionsTotal + ".\n" +
                "This final total of this order is: " + totalPrice + ".";
    }

//    GETTERS

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getAdditions() {
        return additions;
    }

//    SETTERS

}
