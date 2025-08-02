
import java.util.LinkedList;
import java.util.Queue;

public class CountCharactersInQ {
    public static void countCharacters(Queue<String> q){
        int digitCount = 0;
        int alphabetCount = 0;
        int specialCharCount = 0;

        while (!q.isEmpty()) {
            String str = q.poll();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(Character.isDigit(ch)) digitCount++;
                else if(Character.isLetter(ch)) alphabetCount++;
                else specialCharCount++;
            }
        }

        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Number of Alphabets: " + alphabetCount);
        System.out.println("Number of Special Characters: " + specialCharCount);
    }
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("I'm Brajesh Prajapati (the official tyrant 003) !!!");
        countCharacters(q);
    }
}
