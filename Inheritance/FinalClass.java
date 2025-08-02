final class Vehicle{
    void start(){
        System.out.println("Vehicle is Starting....vroom...vroom...");
    }
}

// This will cause a compile-time error 
// class SubClass extends Vehicle { }

public class FinalClass {
    public static void main(String[] args) {
        Vehicle vcl = new Vehicle();
        vcl.start();
    }
}