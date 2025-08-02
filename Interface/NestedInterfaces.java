interface Outer{
    void outerMethod();

    interface Inner{
        void innerMethod();    
    }
}

class MyClass implements Outer.Inner{
    @Override
    public void innerMethod(){
        System.out.println("Inner method implementation...");
    }
}

public class NestedInterfaces {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.innerMethod();
    }
}
