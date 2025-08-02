class Super{
    Super(){
        System.out.println("Super class constructor called.");
    }
}

class Sub extends Super{
    Sub(){
        
        super();
        System.out.println("Sub class constructor called.");
        // super(); // Flexible constructors - This feature is still in preview and must be explicitly enabled using compiler flags (--enable-preview) to experiment with it.
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Sub sb = new Sub();
    }
}