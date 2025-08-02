import java.util.Arrays;
public class PrintUniqueElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,2,1,43,6,6,66,66,67,70};
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}