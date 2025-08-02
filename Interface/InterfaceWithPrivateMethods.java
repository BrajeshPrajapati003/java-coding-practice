interface MyInterface{
    void abstractMethod();
    default void defaultMethod(){
        System.out.println("Default Method");
        privateMethod();
    }

    static void staticMethod(){
        System.out.println("Static Method");
        privateStaticMethod();
    }

    private void privateMethod(){
        System.out.println("Private Method used in Default Method");
    }

    private static void privateStaticMethod(){
        System.out.println("Private Static Method used in a Static Method");
    }
}

public class InterfaceWithPrivateMethods {
    public static void main(String[] args) {
        MyInterface myObj = new MyInterface(){
            @Override
            public void abstractMethod(){
                System.out.println("Implementation of the Abstract Method");
            }
        };

        myObj.abstractMethod();
        myObj.defaultMethod();
        MyInterface.staticMethod();
    }
}
