public class PrintPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,2,-7,-4,7,9};

        System.out.println("Positive elements: ");
        for(int i: arr){
            if(i>0) System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("Negative elements: ");
        for(int i: arr){
            if(i<0) System.out.print(i+" ");
        }
    }
}
