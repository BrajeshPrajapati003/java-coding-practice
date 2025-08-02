import java.util.Scanner;
public class Concatenating2Strings {

    public String concatenate(String s1, String s2){
        if(s1.length() != 0 && s2.length() != 0 && s1.charAt(s1.length()-1) == s2.charAt(0))
            return s1 + s2.substring(1);
        return s1 + s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        System.out.println("The given strings are: "+str1 + " and "+str2);
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        System.out.println("The concatenated string is: ");
        Concatenating2Strings ob = new Concatenating2Strings();
        
        System.out.println(ob.concatenate(s1, s2));
    }
}
