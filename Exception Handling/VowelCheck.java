public class VowelCheck {
    public static void main(String[] args) {
        try{
            String text = "Java handling and managing exceptions ";
            // String text = "Typs gypy fly";
            System.out.println("Original string: "+ text);
            checkVowels(text);
            System.out.println("String contains vowels...");
        }catch(NoVowelException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void checkVowels(String text) throws NoVowelException{
        boolean containsVowels = false;
        String vowels = "aeiouAEIOU";

        for(int i=0; i< text.length(); i++){
            char ch = text.charAt(i);
            if(vowels.contains(String.valueOf(ch))){       //? how does it work??
                containsVowels = true;
                break;
            }
        }
        if(!containsVowels){
            throw new NoVowelException("String doesn't contain any vowels....");
        }
    }
}

class NoVowelException extends Exception{
    public NoVowelException(String message){
        super(message);
    }
}