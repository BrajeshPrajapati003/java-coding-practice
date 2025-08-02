import java.text.Collator;
import java.util.Locale;

public class StringComparison2 {
    public static void main(String[] args) {
        Locale ind = Locale.forLanguageTag("en-IN");
        Collator col = Collator.getInstance(ind);

        String s1 = "cafe";
        String s2 = "café";

        System.out.println("Comparison using Collator: ");
        int diff = col.compare(s1, s2);
        display(diff, s1, s2);
        System.out.println();

        System.out.println("Comparison using String: ");
        diff = s1.compareTo(s2);
        display(diff, s1, s2);
        System.out.println();
        
    }

    public static void display(int diff, String s1, String s2){
        if(diff > 0) System.out.println(s2 + " comes first!");
        else if(diff < 0) System.out.println(s1 + " comes first!");
        else System.out.println("Both Strings are equal");
    }
}