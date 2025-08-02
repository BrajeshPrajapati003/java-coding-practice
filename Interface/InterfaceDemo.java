interface MyInterface{
    static void staticMethod(){
        System.out.println("This is a static method in MyInterface.");
    }

    default void defaultMethod(){
        System.out.println("This is a default method in MyInterface.");
    }

    void abstractMethod();
}

class MyClass implements MyInterface{
    @Override
    public void abstractMethod(){
        System.out.println("This is implementation of the abstract method in MyClass.");
    }

    @Override
    // You can choose to override the default method if needed
    public void defaultMethod(){ 
        System.out.println("This is a custom implementation of the default method in MyClass.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MyInterface.staticMethod();

        MyClass myClass = new MyClass();

        myClass.defaultMethod();
        // MyInterface.defaultMethod(); // Can't access in a static way
        myClass.abstractMethod();
    }
}
