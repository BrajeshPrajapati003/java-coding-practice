import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String str = sc.nextLine();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                // Comparing only with small letters here
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    count++;
                }
            }
            System.out.println("Count of vowels: " + count);
        }
    }
}
