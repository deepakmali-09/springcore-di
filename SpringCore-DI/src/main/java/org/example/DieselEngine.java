package org.example;

public class DieselEngine implements IEngine {

    public DieselEngine() {
        System.out.println("Diesel Engine Constructor...");
    }

    public int start() {
        System.out.println("DieselEngine engine started...");
        return 1;
    }
}
