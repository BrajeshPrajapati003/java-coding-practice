import java.util.HashSet;
public class HashSet2Array {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set is: "+ set);


        //? if the set if of string data type than it can be directly converted into array of string data type by using toArray() method
        //? but this is not possible in the case of primitive data types like int, char, float, boolean etc.

        int[] arr = new int[set.size()];
        int i=0;
        for(int a: set){
            arr[i++] = a;
        }

        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}
