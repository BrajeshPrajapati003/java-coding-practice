import java.util.Arrays;
public class MoveZero2End {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0,5,0,6,0,7,0};
        int count = 0;
        int k = 0;
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }else{
                temp[k++] = arr[i];
            }
        }

        for(int i=0; i<count; i++){
            temp[k++] = 0;
        }
        System.out.println("New Array: "+Arrays.toString(temp));
    }
}