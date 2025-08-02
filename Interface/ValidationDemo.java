import java.util.Scanner;

interface Validator{
    default boolean isValid(String input){
        return validateLength(input) && validateContent(input);
    }

    private boolean validateLength(String input){
        return input.length() >= 5;
    }

    private boolean validateContent(String input){
        return input.matches(".*[a-zA-Z]+.*");
    }
}

public class ValidationDemo implements Validator {
    public static void main(String[] args) {
        ValidationDemo validator = new ValidationDemo();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string to validate: ");
            String input = sc.nextLine();
            
            if(validator.isValid(input)) System.out.println("Input is valid");
            else System.out.println("Input isn't valid");
        }
    }
}
