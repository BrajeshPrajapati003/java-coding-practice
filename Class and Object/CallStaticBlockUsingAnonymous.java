public class CallStaticBlockUsingAnonymous {
    static{
        System.out.println("Static Block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main method starts here");
        new Demo();
        System.out.println("Main method ends here");
    }

    static{
        System.out.println("Static Block 2");
    }
}

class Demo{
    static{
        System.out.println("Static Block 3");
    }

    Demo(){
        System.out.println("Constructor");
    }

    static{
        System.out.println("Static Block 4");
    }
}