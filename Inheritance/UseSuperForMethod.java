class Parent{
    public void className(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent{
    public void className(){
        super.className();
        System.out.println("Child class method");
    }
}

public class UseSuperForMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.className();
    }
}
