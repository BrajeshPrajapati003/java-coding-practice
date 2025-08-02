interface MathUtils{
    static int add(int a, int b){
        return a+b;
    }

    private static int multiply(int a, int b){
        return a*b;
    }

    default int addAndMultiply(int a, int b){
        return add(a, b) + multiply(a, b);
    }
}

public class InterfaceWithPrivateStaticMethod {
    public static void main(String[] args) {
        MathUtils math = new MathUtils(){};
        System.out.println("Result: " + math.addAndMultiply(5, 6));
    }
}
