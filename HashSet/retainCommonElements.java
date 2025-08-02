import java.util.HashSet;
import java.util.Arrays;
public class retainCommonElements {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("red");
        set1.add("pink");
        set1.add("teal");
        set1.add("blue");
        set1.add("green");
        System.out.println("first set: " + set1);

        String[] arr = new String[set1.size()];
        set1.toArray(arr);
        for(String a: arr){
            System.out.print(a+ " ");
        }


        // HashSet<String> set2 = new HashSet<>();
        // set2.add("red");
        // set2.add("teal");
        // set2.add("purple");
        // System.out.println("second set: " + set2);

        // set1.retainAll(set2);
        // System.out.println("final set: " + set1);
    }
}
