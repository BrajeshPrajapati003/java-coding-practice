public class SingleInheritance {
    public static void main(String[] args) {
        SingleInheritance ob;

        // ob.singleInherit(); // Causes Error
        Child o = new Child();
        o.singleInherit();
    }
}

class Child extends SingleInheritance{
    public void singleInherit(){
        System.out.println("Single Inheritance...");
    }
}