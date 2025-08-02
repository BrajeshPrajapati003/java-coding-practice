import java.util.EnumSet;

public class AllElements2 {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumset;
        enumset = EnumSet.allOf(WEEKDAY.class);
        System.out.println(enumset);

    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};
