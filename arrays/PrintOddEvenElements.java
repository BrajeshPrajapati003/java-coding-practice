public class PrintOddEvenElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //print odd elements of the array
        System.out.print("Odd elements of the array: ");
        for (int i: arr) {
            if(i%2 != 0)
                System.out.print(i+" ");
        }

        System.out.println();
        //print even elements of the array and their sum
        System.out.print("Even elements of the array: ");
        for(int i: arr) {
            if (i%2 == 0)
                System.out.print(i+" ");
        }
    }
}
