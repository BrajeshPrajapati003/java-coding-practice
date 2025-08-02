class Vehicle{
    protected String name;
    public Vehicle(String name){
        this.name = name;
    }
    public void wheels(){}

    public void display(){
        System.out.println("This is an AutoMobile.");
    }
}

class Car extends Vehicle{
    public Car(String name){
        super(name);
    }

    public void wheels(){
        System.out.println(name+" has 4 vehicles.");
    }
}

class MotorCycle extends Vehicle{
    public MotorCycle(String name){
        super(name);
    }

    public void wheels(){
        System.out.println(name+" has 2 vehicles.");
    }
}

public class HierarchicalInheritance { // Main Class
    public static void main(String[] args) {

        // Create objects of Child classes
        Car c = new Car("Audi");
        MotorCycle m = new MotorCycle("Pulsar");

        // Call method of Parent class
        c.display();
        m.display();

        // Call method of Child classes
        c.wheels();
        m.wheels();
    }
}