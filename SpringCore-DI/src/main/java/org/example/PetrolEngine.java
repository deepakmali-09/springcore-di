package org.example;

public class PetrolEngine implements IEngine {

    public PetrolEngine() {
        System.out.println("Petrol Engine Constructor...");
    }


    public int start() {
        System.out.println("PetrolEngine engine started...");
        return 1;
    }
}
