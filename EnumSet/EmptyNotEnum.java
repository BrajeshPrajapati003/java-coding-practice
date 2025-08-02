
import java.util.EnumSet;

public class EmptyNotEnum {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumSet1 = EnumSet.noneOf(WEEKDAY.class);
        EnumSet<WEEKDAY> enumSet2;

        enumSet2 = EnumSet.range(WEEKDAY.Wednesday, WEEKDAY.Saturday);

        if(enumSet1.isEmpty()) System.out.println("EnumSet 1 is Empty");
        else System.out.println("EnumSet 1 isn't empty");
        if(enumSet2.isEmpty()) System.out.println("EnumSet 2 is empty");
        else System.out.println("EnumSet 2 isn't empty");

        System.out.println("EnumSet 2: " + enumSet2);
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};