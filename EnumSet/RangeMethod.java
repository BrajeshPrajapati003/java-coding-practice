
import java.util.EnumSet;

public class RangeMethod {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumset;
        enumset = EnumSet.range(WEEKDAY.Monday, WEEKDAY.Wednesday);
        System.out.println(enumset);
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};