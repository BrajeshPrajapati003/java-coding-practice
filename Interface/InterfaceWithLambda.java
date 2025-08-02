interface Operation{
    int perform(int a, int b);
}

public class InterfaceWithLambda {
    public static void main(String[] args) {
        Operation addition = (a,b) -> a+b;
        Operation substraction = (a,b) -> a-b;

        System.out.println("Addition: " + addition.perform(4, 7));
        System.out.println("Substraction " + substraction.perform(10, 7));
    }
}