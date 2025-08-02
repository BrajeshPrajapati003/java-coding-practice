import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class MyData {
    private List<Integer> data;

    // Parameterized constructor (handles null or non-null List<Integer>)
    public MyData(Optional<List<Integer>> data) {
        this.data = data.orElseGet(ArrayList::new);
    }

    // Method to get a copy of the data list (prevents direct modification)
    public List<Integer> getData() {
        return new ArrayList<>(this.data);
    }

    // Method to add an element to the data list
    public void addData(int value) {
        this.data.add(value);
    }
}

public class DeepCopy_TryCatch {
    public static void main(String[] args) {
        // Use ArrayList instead of List.of to create a modifiable list
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        MyData data1 = new MyData(Optional.of(list1)); // Create MyData with list1

        // Create a copy of data1
        MyData data2 = new MyData(Optional.of(data1.getData())); // Create MyData with a copy of data1's list

        // Modify data1
        data1.addData(4);

        // Print data1 and data2 to show they are independent
        System.out.println("Data1: " + data1.getData());
        System.out.println("Data2: " + data2.getData());

        // Create MyData with an empty list
        MyData data3 = new MyData(Optional.empty());

        // Create MyData with null (will use the default empty list)
        MyData data4 = new MyData(Optional.ofNullable(null));


    }
}
