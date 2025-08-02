import java.util.Arrays;
public class CommonElementsArray {

    public static int[] findCommonElements(int[] arr1, int[] arr2){
        // Array of Maximum possible common elements
        int[] common = new int[Math.min(arr1.length, arr2.length)];
        int i=0, j=0, k=0;

        // Sort both Arrays for efficient comparison
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){

                // Store common elements
                common[k++] = arr1[i++];
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{ 
                j++; 
            }
        }

        // resize the common elements to the actual number of common elements
        return Arrays.copyOfRange(common, 0, k);
    
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,43,66,67};
        int[] arr2 = new int[]{0,9,8,7,6,66,43,67};

        int[] common = findCommonElements(arr1, arr2);
        System.out.println("Common elements: "+Arrays.toString(common));

    }
}