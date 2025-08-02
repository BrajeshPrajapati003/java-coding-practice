
import java.util.EnumSet;

public class AllElements {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumSet;

        // Adding elements to enumset
        enumSet = EnumSet.allOf(WEEKDAY.class);

        System.out.println("EnumSet: " + enumSet);
    }
}

enum WEEKDAY{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};
