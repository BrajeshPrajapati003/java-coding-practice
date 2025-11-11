
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String str = sc.nextLine();
            String[] words = str.split("\\s+");
            int count = words.length;
            System.out.println("Count of total words: " + count);
        }
    }
}
