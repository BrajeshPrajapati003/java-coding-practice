import java.util.function.BiFunction;

public class StringConcatenate {
    public static void main(String[] args) {
        String str1 = "Brajesh ";
        String str2 = "Prajapati";

        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;
        String strCon = concatenate.apply(str1, str2);
        System.out.println("Concatenated String: " + strCon);
    }
}
