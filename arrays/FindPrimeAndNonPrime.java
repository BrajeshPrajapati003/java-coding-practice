public class FindPrimeAndNonPrime {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0,5,0,6,0,7,0,3,9,8};
        int i = 0;
        int j = 0;
        int flag = 0;

        for(i=0; i<arr.length; i++){
            flag = 0;
            for(j=2; j<arr[i]/2; j++){
                if(arr[i] % j == 0){
                    flag = 1;
                    break;
                }
            }
            System.out.println(arr[i] + " - "+(flag == 0 ? "Prime": "Non Prime"));
        }
        System.out.println();
    }
}