package org.example;

public class Car {

    //target object
    IEngine engine;

    public Car() {
        System.out.println("Car Constructor...");
    }

    public Car(IEngine engine) {
        this.engine=engine;
    }

    public void setEngine(IEngine engine) {
        System.out.println("Calling setter method...");
        this.engine = engine;
    }

    public void drive() {
        int start = engine.start();

        if(start > 0) {
            System.out.println("Car started...");
        } else {
            System.out.println("Car not started...");
        }
    }
}
