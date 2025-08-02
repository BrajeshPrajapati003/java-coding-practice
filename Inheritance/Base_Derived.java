class Base{
    {
        System.out.println("Base class instance block");
    }

    Base(){
        System.out.println("Base class constructor");
    }

}

class Derived extends Base{
    {
        System.out.println("Derived class instance block");
    }

    Derived(){
        System.out.println("Derived class constructor");
    }
}

public class Base_Derived {
    public static void main(String[] args) {
        // Derived dd = new Derived(); // Warning: The value of local variable dd is not used
        new Derived(); // To supress the above warning (Remove dd, keep assignments with side effects)
    }
}
