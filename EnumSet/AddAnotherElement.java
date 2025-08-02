
import java.util.EnumSet;

public class AddAnotherElement {
    public static void main(String[] args) {
        EnumSet <WEEKDAY> enumset1 = EnumSet.noneOf(WEEKDAY.class);
        EnumSet <WEEKDAY> enumSet2 = EnumSet.noneOf(WEEKDAY.class);

        enumset1.add(WEEKDAY.Friday);
        enumset1.add(WEEKDAY.Saturday);
        
        enumSet2.add(WEEKDAY.Monday);
        enumSet2.add(WEEKDAY.Thursday);

        System.out.println("Elements of EnumSet 1: " + enumset1);
        System.out.println("Elements of EnumSet 2: " + enumSet2);

        enumset1.addAll(enumSet2);

        System.out.println("Elements of EnumSet 1: " + enumset1);
        System.out.println("Elements of EnumSet 2: " + enumSet2);
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}