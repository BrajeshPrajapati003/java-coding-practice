
import java.util.EnumSet;

public class GetComplement {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> enumset;
        enumset = EnumSet.of(WEEKDAY.Tuesday, WEEKDAY.Sunday);
        System.out.println("EnumSet: " + enumset);

        EnumSet<WEEKDAY> com = EnumSet.complementOf(enumset);
        System.out.println("Complement of EnumSet: " + com);
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
};
