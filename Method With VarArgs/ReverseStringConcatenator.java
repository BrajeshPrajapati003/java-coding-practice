
import java.util.Arrays;
public class ReverseStringConcatenator {
    static String concateReverse(String... strings){
        System.out.println("Given Strings: " + Arrays.toString(strings));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strings.length; i++){
            sb.append(strings[strings.length-1-i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String reverseString = concateReverse("Red", "Blue", "Green");
        System.out.println("Reversed concatenated strings: " + reverseString);
    }
}
