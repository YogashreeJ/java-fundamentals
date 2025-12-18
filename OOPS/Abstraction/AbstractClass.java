package Abstraction;
abstract class Vehicle {
    abstract void start();   // abstract method

    void fuel() {            // concrete method
        System.out.println("Petrol or Diesel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuel();
    }
}
