
public class StringAppender {
    static String appendString(String base, String... strings){
        StringBuilder res = new StringBuilder(base);
        for(String str: strings){
            res.append(str);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String finalString = appendString("Hello", ", java", " Programmers' ", ", World!");
        System.out.println("Concatenated string: " + finalString);
    }
}
