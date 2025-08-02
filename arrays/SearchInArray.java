import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,76,45,23};
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter element to be searched: ");
        int target = sc.nextInt();
        boolean found = false;
        int position = 0;
        for(position=0; position<array.length;position++) {
            if(array[position] == target){
                found = true;
                break;
            }
        }
        if(found){ 
            System.out.printf("Element position: %d \n", position+1);
            System.out.println("Element index: " + position);
        }else{
            System.out.println("Element not found");
        }
    }
}