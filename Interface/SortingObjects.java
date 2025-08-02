
import java.util.Arrays;

interface Sortable<T>{
    void sort(T[] arr);
}

class BubbleSort<T extends Comparable<T>> implements Sortable<T>{
    @Override
    public void sort(T[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

public class SortingObjects {
    public static void main(String[] args) {
        Integer[] intArr = {5, 1, 4, 2, 8};
        String[] strArr = {"Brajesh", "Kashish", "Kavita", "Kirti", "Mehak", "Akhil"};

        System.out.println("Given Integers: " + Arrays.toString(intArr));
        System.out.println("Given Strings: " + Arrays.toString(strArr));

        BubbleSort<Integer> intSorter = new BubbleSort<>();
        BubbleSort<String> strSorter = new BubbleSort();

        intSorter.sort(intArr);
        strSorter.sort(strArr);

        System.out.println("Sorted Integer: " + Arrays.toString(intArr));
        System.out.println("Sorted Strings: " + Arrays.toString(strArr));
    }
}
