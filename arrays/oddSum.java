public class oddSum {
    public static void main(String[] args) {
        int[] arr = {12,34,59,45,22};
        int oddSum = 0;
        for (int i : arr) {
            if(i%2 != 0) oddSum += i;
        }
        System.out.println(oddSum);

        int[] arr2 = {56,78,45,79,34};
        int evenSum = 0;
        for (int i : arr2){
            if(i%2 == 0) evenSum += i;
        }
        System.out.println(evenSum);
    }
}
