
import java.util.EnumSet;

public class RemoveAll {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumSet = EnumSet.noneOf(WEEKDAY.class);
        enumSet.add(WEEKDAY.Monday);
        enumSet.add(WEEKDAY.Friday);
        enumSet.add(WEEKDAY.Sunday);

        System.out.println("Before removing the elements: " + enumSet);  // Before removing the elements: [Sunday, Monday, Friday]
        enumSet.clear();
        System.out.println("After removing all elements: " + enumSet); // After removing all elements of enumSet is: []
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};
