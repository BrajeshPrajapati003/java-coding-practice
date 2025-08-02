interface Vehicle{
    void start();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting...");
    }
}

class Motorcycle implements Vehicle{
    @Override
    public void start(){
        System.out.println("Motorcycle is starting...");
    }
}

public class InterfaceInClassHierarchy {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        motorcycle.start();
    }
}
