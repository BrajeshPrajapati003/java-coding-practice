import java.util.HashSet;
public class copySet2Array {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set is: "+ set);

        int[] arr = new int[set.size()];
        int j = 0;
        for(int i: set){
            arr[j++] = i;
        }
        System.out.println("Array is: ");
        for(int i: arr) System.out.print(i+" ");
    }
}
