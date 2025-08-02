import java.util.function.Predicate;
public class Stringchecker2 {
    public static void main(String[] args) {
        String inputString = "Brajesh";
        Predicate<String> isEmpty = str -> str.isEmpty();
        if(isEmpty.test(inputString)) System.out.println("List is empty");
        else System.out.println("List is not empty");
    }
}
