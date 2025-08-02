import java.util.Arrays;
public class MoveZero2End2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0,5,0,6,0,7,0};
        int len = arr.length;
        int count = 0;

        for(int i=0; i<len; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while(count < len){
            arr[count++] = 0;
        }

        System.out.println("New Array: "+Arrays.toString(arr));
    }
}