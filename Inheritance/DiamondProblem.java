interface A{
    default void display(){
        System.out.println("Interface A");
    }
}

interface B extends A{
    default void display(){
        System.out.println("Interface B");
    }
}

interface C extends A{
    default void display(){
        System.out.println("Interface C");
    }
}

class D implements B, C{
    @Override
    public void display(){

        // Resolving the diamond problem by specifying which interface's method to call
        B.super.display(); 
        C.super.display();
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        D ob = new D();
        ob.display();
    }
}