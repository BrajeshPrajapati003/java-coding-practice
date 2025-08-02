public class CopyArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int [] array2 = new int[array1.length];

        for(int i=0; i<array1.length; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i]+" ");
        }


        //using the printf methods like we used in C language to print some integers, characters, float values, etc.

        
        // for(int i=0; i<array2.length; i++){
        //     System.out.printf("\narray2[%d] = %d",i,array2[i]);
        // }
    }
}
