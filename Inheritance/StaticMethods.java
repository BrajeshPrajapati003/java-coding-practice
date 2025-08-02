class Vehicle{ // Parent class
    public static void disp(){
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle{ // Child class
    public static void disp(){
        System.out.println("This is a Car");
    }
}

public class StaticMethods { // Main class
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();
        // v.disp();
        // Car c = new Car();
        // c.disp();

        Vehicle.disp(); // Accessing static method in parent class
        Car.disp(); // Accessing static method in child class
    }
}