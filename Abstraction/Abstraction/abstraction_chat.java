package Abstraction;

abstract class Vehicle {
    abstract void start(); // abstract method (no body)

    void fuel() {
        // System.out.println("Vehicle uses fuel.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class abstraction_chat {   
    public class Main {
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            myCar.start();   // Output: Car starts with a key.
            myCar.fuel();    // Output: Vehicle uses fuel.
        }
    }
    
}
