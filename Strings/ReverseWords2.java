public class ReverseWords2 {
    public static void main(String[] args) {
        String str = "43 and 66";
        System.out.println("The Original String: " + str);
        System.out.println("The Reversed String: " + reverseWords(str));
    }

    public static String reverseWords(String str){
        StringBuilder sb1 = new StringBuilder(str);
        String s1 = sb1.reverse().toString();
        String[] words = s1.split(" ");

        StringBuilder reverse = new StringBuilder();
        for(String w : words){
            sb1 = new StringBuilder(w);
            reverse.append(sb1.reverse().append(" "));
        }
        reverse.deleteCharAt(reverse.length() - 1);
        return reverse.toString();
    }
}
