
import java.util.EnumSet;

public class RemoveElement {
    public static void main(String[] args){
        EnumSet<WEEKDAY> enumset1 = EnumSet.noneOf(WEEKDAY.class);
        EnumSet<WEEKDAY> enumset2 = EnumSet.noneOf(WEEKDAY.class);

        enumset1.add(WEEKDAY.Friday);
        enumset1.add(WEEKDAY.Monday);

        enumset2.add(WEEKDAY.Monday);
        enumset2.add(WEEKDAY.Saturday);

        System.out.println("Elements of EnumSet 1: " + enumset1);
        System.out.println("Elements of EnumSet 2: " + enumset2);

        enumset1.retainAll(enumset2);
        System.out.println("\nElements of EnumSet 1: " + enumset1);
        System.out.println("Elements of EnumSet 2: " + enumset2);
        
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};
