public class SumOfCubicValues {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int sumOfCubicValues = 0;
        for (int i : arr) {
            // i = i*i*i;
            // sumOfCubicValues += i;

            sumOfCubicValues += (i*i*i);
        }
        System.out.println(sumOfCubicValues);

    }
}
