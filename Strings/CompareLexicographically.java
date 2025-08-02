import java.util.Scanner;
public class CompareLexicographically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        sc.close();
        System.out.println("The given strings are lexicographically equal: "+isLexicograph(s1, s2));
        
    }

    public static boolean isLexicograph(String s1, String s2){
        boolean isLexicograph = false;
        if(s1.length() == s2.length()){
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i) == s2.charAt(i))
                isLexicograph = true;
            }
        }else{
            return isLexicograph;
        }
        return isLexicograph;
    }
}
