public class NegativeElementSum {
    public static void main(String[] args) {
        int[] a = {1,-5,-10, 2, 3, 4, 5,-1,-2,-3};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0){
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
