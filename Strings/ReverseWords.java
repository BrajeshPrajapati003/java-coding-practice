public class ReverseWords {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati is a Khalnayak";
        System.out.println("Given String: " + str);
        System.out.println("Reversed words in String: " + reverseWords(str));
    }

    public static String reverseWords(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();

        // The entire String got reversed here
        System.out.println(rev);

        String[] words = rev.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (String w : words) {
            sb = new StringBuilder(w);
            reverse.append(sb.reverse()).append(" ");
        }
        reverse.deleteCharAt(reverse.length() - 1);
        return reverse.toString();
    }
}