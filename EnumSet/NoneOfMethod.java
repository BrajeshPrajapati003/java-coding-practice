
import java.util.EnumSet;

public class NoneOfMethod {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumset = EnumSet.allOf(WEEKDAY.class);
        System.out.println("This is enumset: " + enumset);

        EnumSet<WEEKDAY> emptySet = EnumSet.noneOf(WEEKDAY.class);
        System.out.println("This is empty set: " + emptySet);
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};