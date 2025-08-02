interface Operation{
    int perform(int a, int b);
}
public class InterfaceWithLambda2 {
    public static void main(String[] args) {
        Operation add = (a,b) -> a+b;
        Operation divide = (a,b) -> a/b;

        System.out.println(add.perform(4,7));
        System.out.println(divide.perform(10, 2));
    }
}
