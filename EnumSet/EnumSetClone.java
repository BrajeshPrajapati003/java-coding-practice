
import java.util.EnumSet;

enum WEEKDAY{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

public class EnumSetClone {
    public static void main(String[] args) {
        EnumSet <WEEKDAY> enum_set;
        EnumSet <WEEKDAY> clone_set;

        // Adding elements to EnumSet
        enum_set = EnumSet.allOf(WEEKDAY.class);
        System.out.println("EnumSet is: " + enum_set);

        clone_set = enum_set.clone();
        System.out.println("Clone set of EnumSet is: " + clone_set);
    }
}
