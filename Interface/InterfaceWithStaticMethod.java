interface MathOperation{
    static int add(int a, int b){
        return a+b;
    }

    static int subtract(int a, int b){
        return a-b;
    }
}

public class InterfaceWithStaticMethod {
    public static void main(String[] args) {
        int sum = MathOperation.add(4,5);
        int sub = MathOperation.subtract(9, 3);

        System.out.println("Addition: "+ sum);
        System.out.println("Subtraction: " + sub);
    }
}
