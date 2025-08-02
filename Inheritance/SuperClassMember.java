class Parent{ // Parent class
    protected String message = "Brajesh Prajapati";
}

class Child extends Parent{ // Child class
    protected String message = "CS066";

    public void message(){
        System.out.println("Message 1: "+super.message); // Accessing Parent class member using super keyword
        System.out.println("Message 2: "+message); // Accessing Child class member
    }
}

public class SuperClassMember { // Main class
    public static void main(String[] args) {
        Child child = new Child();
        child.message();
    }
}