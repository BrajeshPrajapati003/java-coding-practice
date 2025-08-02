@FunctionalInterface
interface Operation{
    int perform(int a, int b);
}

public class FunctionalInterfaceWithLambda {

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Operation addition = (a,b) -> a+b;
        Operation addition2 = FunctionalInterfaceWithLambda::add; // Method reference

        System.out.println("Addition: " + addition.perform(4,6));
        System.out.println("Addition2: " + addition2.perform(10, 5));
    }
}
