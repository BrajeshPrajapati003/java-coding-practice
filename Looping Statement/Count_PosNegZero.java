import java.util.InputMismatchException;
import java.util.Scanner;

public class Count_PosNegZero{
    public static void main(String[] args) {
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        try(Scanner sc = new Scanner(System.in)){
            char choice;
            int input;
            do{
                System.out.println("Enter a number:");
                try {
                    input = sc.nextInt();
                    if(input > 0) countPos++;
                    else if(input < 0) countNeg++;
                    else countZero++;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid number entered, Closing the program...!");
                    break;
                }
                
                System.out.print("Do you want to continue y/n?: ");
                choice = sc.next().charAt(0);
                
            }while(choice == 'y' || choice == 'Y');
        }

        System.out.println("Total Positive numbers: " + countPos);
        System.out.println("Total Negative numbers: " + countNeg);
        System.out.println("Total Zeroes: " + countZero);

    }
}