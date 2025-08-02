import java.util.Scanner;
public class RaisedToThePower {
    public static void main(String[] args) {
        System.out.println("Enter the Base:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter the power:");
        int pow = sc.nextInt();
        sc.close();

        int ans = 1;
        for(int i=0; i<pow; i++){
            ans *= base;
        }
        System.out.println(base+" to the power "+pow+": "+ans);
    
    }   
}
