// Define an interface with a static factory method
interface MyInterface{
    void doSomething();
    // Static factory method to create instances
    static MyInterface createInstance(){
        return new MyConcreteClass();
    }
}

// Create a concrete class that implements the interface
class MyConcreteClass implements MyInterface{
    @Override
    public void doSomething(){
        System.out.println("MyConcreteClass is doing something");
    }
}

public class StaticFactoryMethod {
    public static void main(String[] args) {
        // Use the static factory method to create an instance
        MyInterface obj = MyInterface.createInstance();
        // Call the method on the created instance
        obj.doSomething();
    }
}
