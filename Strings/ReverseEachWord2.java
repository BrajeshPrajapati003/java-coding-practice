public class ReverseEachWord2 {
    public static void main(String[] args) {
        reverseEachWord("Roll number hai 66");
    }

    public static String reverseEachWord(String str){
        String[] words = str.split(" ");
        String rev = "";
        for(String word : words){
            rev = rev + reverseWithStringConcat(word) + " ";
        }
        display(str, rev);
        return rev;
    }

    public static final String reverseWithStringConcat(String string){
        String rev_word = "";
        for(int i = (string.length()-1); i >= 0; i--){
            rev_word = rev_word + string.charAt(i);
        }
        return rev_word;
    }

    public static final void display(String str, String rev){
        System.out.println(str);
        System.out.println(rev);
    }
}