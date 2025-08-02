interface A{
    default void sayHello(){
        System.out.println("Hello from A");
    }
}

interface B{
    default void sayHello(){
        System.out.println("Hello from B");
    }
}

class MyClass implements A, B{
    @Override
    public void sayHello(){
        // Resolve the conflict by specifying the interface
        A.super.sayHello(); // Hello from A
        B.super.sayHello(); // Hello from B
    }
}

public class InterfaceInheritance_DefaultMethod {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello();
    }
}
