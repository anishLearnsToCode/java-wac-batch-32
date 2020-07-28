package day9;

public class Vehicle {
    String model;
    String brand;
    private final int numberOfWheels;

    Vehicle() {
        this(2);
    }

    Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    Vehicle(int numberOfWheels, String model, String brand) {
        this(numberOfWheels);
        this.model = model;
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
