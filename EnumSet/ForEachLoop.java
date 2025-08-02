import java.util.EnumSet;

public class ForEachLoop {
    public static void main(String[] args) {
        EnumSet<WEEKDAY> item = EnumSet.noneOf(WEEKDAY.class);
        
        item.add(WEEKDAY.Wednesday);
        item.add(WEEKDAY.Friday);
        item.add(WEEKDAY.Tuesday);

        System.out.println("Elements of EnumSet:");
        for(WEEKDAY i: item){
            System.out.print(i + " ");
        }
    }
}

enum WEEKDAY{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}