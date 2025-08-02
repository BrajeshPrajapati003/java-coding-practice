import java.util.Scanner;

public class SmallestAmong3Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();
        
        if(n1>n2){
            if(n2<n3){
                System.out.println("Smallest number: " + n2);
            }else{
                System.out.println("Smallest number: " + n3);
            }
        }else{
            if(n3<n1){
                System.out.println("Smallest number: " + n3);
            }else{
                System.out.println("Smallest number: " + n1);
            }
        }
    }
}