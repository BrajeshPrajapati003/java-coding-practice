import java.util.Scanner;
public class AvgOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum/arr.length;
        System.out.println(avg);
    }
}
