import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the starting number:");
            int start = sc.nextInt();
            System.out.println("Enter the ending number:");
            int end = sc.nextInt();
            sc.close();
            while(start <= end){
                System.out.print( start+" ");
                start++;
            }

            // for(int i=1; i<=n; i++){
            //     System.out.print(i+" ");
            // }

        }
    }
}
