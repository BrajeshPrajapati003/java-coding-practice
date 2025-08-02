import java.util.StringTokenizer;
public class CountTokens2 {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati is learning string tokenizer.";
        // Default delimiter: space( )
        StringTokenizer tokenizer = new StringTokenizer(str);

        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

        System.out.println();
        System.out.println("String 2 starts here....");
        System.out.println();
        
        // Example with specific delimiters
        String str2 = "apple, banana; orange red red apple";
        // Delimiters: ,  , and ;
        StringTokenizer tokenizer2 = new StringTokenizer(str2, " ,;");

        while(tokenizer2.hasMoreTokens()){
            String token2 = tokenizer2.nextToken();
            System.out.println(token2);
        }
    }
}
