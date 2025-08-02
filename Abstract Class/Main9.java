public class Main9 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}

abstract class Vehicle{
    void start(){
        System.out.println("Vehicle starts with engine...");
    }
    abstract void stop();
}

class Car extends Vehicle{
    @Override
    void stop(){
        System.out.println("Stops using brakes...");
    }
}