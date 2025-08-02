public class ReverseWords3 {
    public static void main(String[] args) {
        String str = "Brajesh - 43 and Prajapati - 66";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedWords(str));
    }

    public static String reversedWords(String str){
        StringBuilder sb1 = new StringBuilder(str);
        String str2 = sb1.reverse().toString();
        String[] words = str2.split(" ");

        StringBuilder reverse = new StringBuilder();
        for(String s : words){
            sb1 = new StringBuilder(s);
            reverse.append(sb1.reverse().append(" "));
        }

        reverse.deleteCharAt(reverse.length() - 1);
        return reverse.toString();

    }
}
