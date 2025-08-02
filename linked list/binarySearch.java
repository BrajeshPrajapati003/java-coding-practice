public class binarySearch {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int target = 3;

    int result = binarySearch(arr, target);
    if(result != -1) System.out.println("Element found at index "+ result);
    else System.out.println("Element not found");
  }

  public static int binarySearch(int arr[], int target){
    int si = 0;
    int ei = arr.length-1;
    while(si<=ei){
      int mid = (si+ei)/2;
      if(arr[mid] == target){
        return mid;
      }else if(arr[mid] < target){
        si = mid+1;
      }else if(arr[mid] > target){
        ei = mid-1;
      }
    }
    return -1;
  }
}
