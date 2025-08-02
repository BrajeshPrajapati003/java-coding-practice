interface StringUtil{
    default String reverse(String input){
        return new StringBuilder(input).reverse().toString();
    }

    default String toUpperCase(String input){
        return input.toUpperCase();
    }
}

public class StringManipulation implements StringUtil {
    public static void main(String[] args) {
        StringManipulation main = new StringManipulation();
        String str = "Brajesh Prajapati";

        System.out.println("Reversed String: " + main.reverse(str));
        System.out.println("Uppercase String: " + main.toUpperCase(str));
    }
}
