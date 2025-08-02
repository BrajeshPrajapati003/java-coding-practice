import java.util.Scanner;
public class throwException{
    public static void main(String args[]){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int num = sc.nextInt();
        System.out.println("Enter the denominator:");
        int denom = sc.nextInt();
        sc.close();
        try{
            result = num/denom;
            System.out.println("result: "+ result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured!!!");
        }
        System.out.println("Program completion!");
    }
}