public class ReversedWordsOptimized2 {
    public static void main(String[] args) {
        String str = "brajesh prajapati is a khalnaayak";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }

    public static String reverse(String str){
        StringBuilder reversed = new StringBuilder();
        String[] words = str.split(" ");

        for(int i=words.length - 1; i>=0; i--){
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
