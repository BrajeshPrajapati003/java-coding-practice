@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Calculator addition = (a,b) -> a+b;
        Calculator substraction = (a,b) -> a-b;

        System.out.println("Addition: " + addition.calculate(3, 4));
        System.out.println("Substraction: " + substraction.calculate(10, 3));
    }
}
