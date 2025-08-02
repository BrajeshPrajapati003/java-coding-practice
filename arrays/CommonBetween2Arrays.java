public class CommonBetween2Arrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,43,66,67};
        int[] arr2 = new int[]{0,9,8,7,6,66,43,67};
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        int[] commonArray = new int[arr1Len+arr2Len];
        int k = 0;

        for(int i=0; i<arr1Len; i++){
            for(int j=0; j<arr2Len; j++){
                if(arr1[i] == arr2[j]){
                    commonArray[k++] = arr1[i];
                    // System.out.print(arr1[i]+" ");
                }
            }
        }

        for(int i=0; i<k; i++){
            System.out.print(commonArray[i]+" ");
        }
    }
}
