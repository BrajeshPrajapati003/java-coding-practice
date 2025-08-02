import java.text.Collator;
import java.util.Locale;

public class StringComparison {
    public static void main(String[] args) {

        // Locale() constructor has been deprecated since version 19

        // Instead of:
        // Locale us = new Locale("en", "US");

        // Use:
        Locale us = Locale.forLanguageTag("en-US");

        Collator col = Collator.getInstance(us);
        String s1 = "Pineapple";
        String s2 = "Watermelon";

        System.out.println("Comparing Strings using Collator: ");
        int diff = col.compare(s1, s2);
        display(diff, s1, s2);

        System.out.println("Comparing Strings using String: ");
        diff = s1.compareTo(s2);
        display(diff, s1, s2);
    }

    public static void display(int diff, String s1, String s2){
        if(diff<0) System.out.println(s1 + " Comes Before " + s2);
        else if(diff>0) System.out.println(s1 + " Comes After " + s2);
        else System.out.println(s1 + " and " + s2 + " are the Same Strings");
    }
}