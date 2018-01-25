package com.chrismalloy;

public class Car {

    // initialize state component variables
    // initialize as private to preserve encapsulation rules
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // set method to update state, instead of changing it's initialized state
    public void setModel(String model){
//        model validation
        String validModel = model.toLowerCase();
        if(validModel.equals("911") || validModel.equals("m3")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // get method to return information
    public String getModel() {
        return this.model;
    }
}
