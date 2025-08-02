import java.util.HashSet;
public class diffTypesItemsSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(1);
        set.add("brajesh");
        set.add(345.234);
        set.add(true);
        set.add('a');
        // System.out.println("set is: "+ set);

        for(Object i: set) System.out.println(i);
    }
}
