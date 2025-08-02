class SuperClass{
    static void display(){
        System.out.println("Static method in super class");
    }
}

class SubClass extends SuperClass{
    static void display(){
        System.out.println("Static method in sub class");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        SuperClass sp = new SuperClass();
        SuperClass subAsSuper = new SubClass();
        SubClass sb = new SubClass();

        sp.display();
        sb.display();
        subAsSuper.display(); // Display method of Superclass is hidden for the instance of subclass (method hiding)
    }
}