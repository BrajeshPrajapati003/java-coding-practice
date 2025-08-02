import java.util.Arrays;
import java.util.Scanner;
public class IsAnagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string 1 : ");
            String str1 = sc.next();
            System.out.println("Enter the string 2 : ");
            String str2 = sc.next();
            // System.out.println("Debugging");
            
            if(isAnagram(str1, str2)) System.out.println("Anagram Strings");
            else System.out.println("Strings aren't Anagrams");
        }
    }

    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

        String sortS1 = new String(strArr1);
        String sortS2 = new String(strArr2);

        return sortS1.equals(sortS2);

    }
}
