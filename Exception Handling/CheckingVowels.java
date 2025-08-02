public class CheckingVowels {
    public static void main(String[] args) {
        try{
            // String text = "Ji haa me hu khalnayak";
            String text = "bcdfghjklmnpqrstvwxyz";
            System.out.println("Original Text: "+ text);
            checkVowels(text);
            System.out.println("The given string doesn't contain any vowels...");
        }catch(ContainsVowels e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void checkVowels(String text) throws ContainsVowels{
        boolean containVowels = false;
        String vowels = "aeiouAEIOU";
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                containVowels = true;
                break;
            }
        }
        if(containVowels){
            throw new ContainsVowels("The given string contains vowels....");
        }
    }
}

class ContainsVowels extends Exception{
    public ContainsVowels(String message){
        super(message);
    }
}
