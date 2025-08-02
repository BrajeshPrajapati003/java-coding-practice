import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetrieveElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the index to retrieve element: ");
            int idx = sc.nextInt();
            System.out.println("Element at index " + idx + ": " + list.get(idx));
        }
    }
}
