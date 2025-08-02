public class CallUsingAnonymousObj {
    public static void main(String[] args) {
        new Test().print();
    }
}

class Test{
    private static boolean testObj = true;
    Test(){
        System.out.println("Test constructor executed....");
    }
    public void print(){
        System.out.println("Test Class....??? : "+testObj);
    }
}