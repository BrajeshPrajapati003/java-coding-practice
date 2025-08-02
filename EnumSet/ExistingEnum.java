
import java.util.EnumSet;

public class ExistingEnum {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumset;

        enumset = EnumSet.allOf(WEEKDAY.class);
        System.out.println("EnumSet: " + enumset);

        EnumSet<WEEKDAY> newSet = EnumSet.copyOf(enumset);
        System.out.println("New EnumSet: " + newSet);
    }
}
