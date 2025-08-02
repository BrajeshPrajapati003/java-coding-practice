import java.util.Scanner;
public class IllegalArgException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        tryNumber(num);

        System.out.println("Program completion...");
        
    }

    public static void tryNumber(int n){
        try{
            checkForEven(n);
            System.out.println(n+ " is an odd number!");
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void checkForEven(int x){
        if(x % 2 != 1){
            throw new IllegalArgumentException(x+ " is an even number!");
        }
    }
}
