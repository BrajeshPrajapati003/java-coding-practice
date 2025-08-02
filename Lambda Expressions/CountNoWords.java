
interface WordCounter{
    int countWords(String sentence);
}

public class CountNoWords {
    public static void main(String[] args) {
        WordCounter wordCounter = sentence -> sentence.split("\\s+").length;
        System.out.println("Number of words: " + wordCounter.countWords("Brajesh Prajapati is a Khalnaayak hihi!"));
    }
}

