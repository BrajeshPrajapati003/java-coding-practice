public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Hello World";
        String output = reverseEachWord(input);
        System.out.println(output); // Output: "olleh dlrow"
    }

    public static String reverseEachWord(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(String word: words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}