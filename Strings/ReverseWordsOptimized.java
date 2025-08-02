public class ReverseWordsOptimized {
    public static void main(String[] args) {
        String str = "brajesh prajapati is a programmer";
        System.out.println("Original string: " + str);
        System.out.println("Reversed Array: " + reverse(str));
    }

    public static String reverse(String str){
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for(int i=words.length - 1; i>= 0; i--){
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}