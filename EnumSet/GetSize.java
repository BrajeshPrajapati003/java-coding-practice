
import java.util.EnumSet;

public class GetSize {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumset = EnumSet.noneOf(WEEKDAY.class);

        enumset.add(WEEKDAY.Monday);
        enumset.add(WEEKDAY.Friday);
        enumset.add(WEEKDAY.Sunday);

        System.out.println("Size of the EnumSet: " + enumset.size()); // 3
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};