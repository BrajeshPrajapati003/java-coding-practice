import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter two strings: ");
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            System.out.println("First String: "+str1);
            System.out.println("Second String: "+str2);
            System.out.println();

            if(str1.length() == str2.length()){
                System.out.println("Are both Strings equal? : " + compareStrings(str1, str2));
            }else{
                System.out.println("Not equal Strings!!");
            }
        }
    }

    public static boolean compareStrings(String str1, String str2){
        str1 = str1.trim();
        str2 = str2.trim();
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != (str2.charAt(i))) return false;
        }
        return true;
    }
}
