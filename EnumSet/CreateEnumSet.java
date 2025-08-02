import java.util.EnumSet;

enum WEEKDAY{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

public class CreateEnumSet{
    public static void main(String[] args){
        EnumSet<WEEKDAY> enumSet;

        // Adding elements to enumset
        enumSet = EnumSet.of(WEEKDAY.Wednesday, WEEKDAY.Friday, WEEKDAY.Sunday);
        System.out.println("EnumSet is: " + enumSet);
    }
}