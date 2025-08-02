class Vehicle{ // Parent class
    Vehicle(){
        System.out.println("Vehicle class Constructor");
    }
}

class Car extends Vehicle{ // Child class
    public Car(){
        super(); // Calls the constructor of the superclass
        System.out.println("Car class Constructor");
    }
}

public class Initialization { // Main class
    public static void main(String[] args) {
        Car c = new Car();
    }
}