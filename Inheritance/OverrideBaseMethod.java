class Vehicle{
    public void display(){
        System.out.println("This is vehicle class.");
    }
}

class Car extends Vehicle{
    @Override
    public void display(){
        System.out.println("This is Car (child) class.");
    }
}

public class OverrideBaseMethod {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
