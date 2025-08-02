class Vehicle{ // Super class
    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }
}

class Car extends Vehicle{ // Sub class
    String model;
    Car(String brand, String model){
        super(brand);
        this.model = model;
    }

}
public class Initialization2 { // Main class
    public static void main(String[] args) {
        Car car = new Car("Audi", "R8-etron");
        System.out.println("Brand: "+car.brand);
        System.out.println("Model: "+car.model);
    }
}