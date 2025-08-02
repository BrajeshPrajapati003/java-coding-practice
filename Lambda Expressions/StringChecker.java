import java.util.function.Predicate;
public class StringChecker {
    public static void main(String[] args) {
        String inputStr = "Brajesh Prajpati";
        Predicate<String> isEmpty = str -> str.isEmpty();
        if(isEmpty.test(inputStr)) System.out.println("String is empty");
        else System.out.println("String is not empty");
    }
}
