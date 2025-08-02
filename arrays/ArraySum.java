import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
        int sum = 0;
        for (int i: arr){
            sum += i;
        }
        System.out.println(sum);
    }
}