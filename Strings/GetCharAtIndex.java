import java.util.Scanner;
public class GetCharAtIndex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Enter the index to find the character:");
        int index = sc.nextInt();
        sc.close();
        char s = getChar(str, index);
        if( s != '0') System.out.println(s);
        else System.out.println("Invalid index passed!");
    }

    public static char getChar(String s, int idx){
        if(s.length() != 0 && idx >= 0){
            char ch = (s.charAt(idx));
            return ch;
        }
        return '0';
    }
}