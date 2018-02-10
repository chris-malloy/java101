package com.chrismalloy;

    class Car {
        private boolean engine;
        private boolean engineOn;
        private int cylinders;
        private int wheels;
        private int doors;
        private int horsePower;
        private String color;
        private String name;

        public Car(int cylinders, int doors, int horsePower, String color, String name) {
            this.engine = true;
            this.engineOn = false;
            this.cylinders = cylinders;
            this.wheels = 4;
            this.doors = doors;
            this.horsePower = horsePower;
            this.color = color;
            this.name = name;
        }

        public String startEngine(){
            this.engineOn = true;
            return "Car -> startEngine()";
        }

        public String accelerate(){
            return "Car -> accelerate()";
        }

        public String brake(){
            return "Car -> brake()";
        }

        public boolean isEngine() {
            return engine;
        }

        public boolean isEngineOn(){
            return engineOn;
        }

        public int getCylinders() {
            return cylinders;
        }

        public int getWheels() {
            return wheels;
        }

        public int getDoors() {
            return doors;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public String getColor() {
            return color;
        }

        public String getName() {
            return name;
        }
    }

    class Ferrari extends Car {
        public Ferrari(int cylinders, int doors, int horsePower, String color, String name) {
            super(cylinders, doors, horsePower, color, name);
        }

        @Override
        public String startEngine() {
            return "Launch control engaged";
        }

        @Override
        public String accelerate() {
            return "Hang on!";
        }

        @Override
        public String brake() {
            return "This hurts.";
        }
    }

    class Hummer extends Car {
        public Hummer(int cylinders, int doors, int horsePower, String color, String name) {
            super(cylinders, doors, horsePower, color, name);
        }

        @Override
        public String startEngine() {
            return "Hummer is on.";
        }

        @Override
        public String accelerate() {
            return "You're wasting gas.";
        }

        @Override
        public String brake() {
            return "This is going to take awhile.";
        }
    }

    class BMW extends Car {
        public BMW(int cylinders, int doors, int horsePower, String color, String name) {
            super(cylinders, doors, horsePower, color, name);
        }

        @Override
        public String startEngine() {
            return "BMW is ready to go";
        }

        @Override
        public String accelerate() {
            return "This is going to be fun.";
        }

        @Override
        public String brake() {
            return "Slowing down now";
        }
    }

public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car car = new Car(4, 4,100,"White", "Base Car");
        System.out.println(car.startEngine());
        Ferrari ferrari = new Ferrari(8, 2, 700, "red", "Ferrari");
        System.out.println(ferrari.startEngine());
        Hummer hummer = new Hummer(8,4,400,"Yellow","Hummer");
        System.out.println(hummer.startEngine());

    }
}
