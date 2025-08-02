import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayLargestAndSmallest {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char choice;
        try(Scanner sc = new Scanner(System.in)){
            do {
                System.out.println("Enter a number: ");
                int input = sc.nextInt();
                
                if(input < smallest) smallest = input;
                if(input > largest) largest = input;

                System.out.println("Do you want to continue y/n?: ");
                choice = sc.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');

        } catch (InputMismatchException e) {
            System.out.println("InputMismatch Exception occured..!");
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
