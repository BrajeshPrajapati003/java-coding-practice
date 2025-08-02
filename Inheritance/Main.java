class Vehicle{
    static void display(){
        System.out.println("Static method in Vechicle");
    }

    void instanceMethod(){
        System.out.println("Instance method in Vehicle");
    }
}

class Car extends Vehicle{
    static void display(){
        // super.display(); // This would cause a compilation error
        System.out.println("Static method in Car");
    }

    @Override
    void instanceMethod(){
        super.instanceMethod(); // This is valid
        System.out.println("Instance method in Car");
    }
}

public class Main {
    public static void main(String[] args) {
        Car.display();
        Car car = new Car();
        car.instanceMethod();
    }
}