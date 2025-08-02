                        
                        
                        
                        //? not giving the correct answer - don't know why!!!


import java.util.Scanner;

public class ExceptionIfNotVowel {
    public static void main(String[] args) {
        try{
            String str = takeInput();
            System.out.println("given string is: " + str);

            checkVowels(str);

            System.out.println("The given string contains vowels!!!!");
        }catch(NoVowelException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static String takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    public static void checkVowels(String str) throws NoVowelException{
        boolean containsVowels = false;
        String vowels = "aeiouAEIOU";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                containsVowels = true;
                break;
            }
        }if(!containsVowels){
            throw new NoVowelException("String does not contain any vowels...");
        }
    }
}

class NoVowelException extends Exception{
    public NoVowelException(String message){
        super(message);
    }
}
