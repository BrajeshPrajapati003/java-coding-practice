
import java.util.Arrays;
public class StringConcatenator {
    static String concatenateStrings(String delimeter, String... strings){
        System.out.println("Given String: " + Arrays.toString(strings));
        StringBuilder res = new StringBuilder();
        for(int i=0; i<strings.length; i++){
            res.append(strings[i]);
            if(i<strings.length - 1){
                res.append(delimeter);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String concatString = concatenateStrings("-", "Pink", "Blue", "White", "Red");

        System.out.println("Concatenated string: " + concatString);
    }
}
