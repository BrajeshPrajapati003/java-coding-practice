import java.util.Scanner;
public class ExceptionIfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        tryNumber(num);
        System.out.println("program completion...");
    }

    public static void tryNumber(int num){
        try{
            checkNumber(num);
            System.out.println(num+ " is an even number!");
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void checkNumber(int num){
        if(num % 2 == 1){
            throw new IllegalArgumentException(num + " is an odd number!");
        }
    }
}
