import java.util.Scanner;

public class MiddleOfString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            int pos, len;
            if(str.length()%2 == 0){
                pos = str.length()/2-1;
                len = 2;
            }else{
                pos = str.length()/2;
                len = 1;
            }

            System.out.println("Middle character in the string: " + str.substring(pos, pos+len));
        }
    }
}
