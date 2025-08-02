import java.util.Arrays;
import java.util.Collections;

public class SortArrays {
   public SortArrays() {
   }

   public static void main(String[] args) {
      Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 3, 2};

      //print the original array
      System.out.println("original array:" + Arrays.toString(arr));
      System.out.println();

      //SORTING in ascending order
      Arrays.sort(arr);
      System.out.println("sorted array in Ascending order:" + Arrays.toString(arr));
      System.out.println();

      //first sort in ascending order then reverse it
      Arrays.sort(arr, Collections.reverseOrder());
      System.out.println("sorted array in Descending order:" + Arrays.toString(arr));
   }
}
