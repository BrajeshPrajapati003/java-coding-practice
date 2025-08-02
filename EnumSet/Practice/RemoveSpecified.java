
import java.util.EnumSet;
public class RemoveSpecified {
    public static void main(String[] args){
        EnumSet<WEEKDAY> enumset = EnumSet.allOf(WEEKDAY.class);
        System.out.println("EnumSet: " + enumset);
        enumset.remove(WEEKDAY.Friday);
        enumset.remove(WEEKDAY.Sunday);
        System.out.println("After removing specific elements: " + enumset);
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};