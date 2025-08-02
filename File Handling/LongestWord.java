import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) throws FileNotFoundException {
        // findLongestWord() isn't static, object is required to call it
        new LongestWord().findLongestWord();
    }

    public String findLongestWord() throws FileNotFoundException{
        String longWord = "";
        String currWord;
        try(Scanner sc = new Scanner(new File("file.txt"));){
            while(sc.hasNext()){
                currWord = sc.next();
                if(currWord.length() > longWord.length()) longWord = currWord;
            }
            System.out.println(longWord);
            return longWord;
        }
    }
}
