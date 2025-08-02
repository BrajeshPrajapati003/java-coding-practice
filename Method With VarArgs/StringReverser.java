import java.util.Arrays;

public class StringReverser {
    static String[] reverseStrings(String... strings){
        System.out.println("Given strings: " + Arrays.toString(strings));
        String[] reversed = new String[strings.length];

        for(int i=0; i<strings.length; i++){
            reversed[i] = new StringBuilder(strings[i]).reverse().toString();
        }
        return reversed;
    }

    public static void main(String[] args) {
        String[] reversedStrings = reverseStrings("Blue","Pink", "Green", "Red");
        System.out.println(Arrays.toString(reversedStrings));
    }
}
