import java.util.EnumSet;

enum WEEKDAY{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

public class CreateEnumSet2 {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumset;

        enumset = EnumSet.of(WEEKDAY.Monday, WEEKDAY.Sunday);
        System.out.println(enumset);
    }
}
