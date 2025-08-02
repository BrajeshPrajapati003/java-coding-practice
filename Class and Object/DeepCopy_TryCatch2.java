import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class MyData{

    private final List<Integer> data; // Using 'final' for immutability within the class
    
    // Constructor with Optional for handling null or non-null List<Integer> 
    public MyData(Optional<List<Integer>> data){
        this.data = data.orElseGet(ArrayList::new);
    }

    // Get a copy of the data list (ensures immutability for the caller)
    public List<Integer> getData(){
        return new ArrayList<>(this.data);
    }

    // Add an element to the data list (modifies the internal state)
    public void addData(int value){
        this.data.add(value);
    }

}

public class DeepCopy_TryCatch2 {
    public static void main(String[] args) {

        // Create a modifiable list
        List<Integer> list1 = new ArrayList<>(List.of(43,66,67));

        // Create a MyData object with the initial list
        MyData data1 = new MyData(Optional.of(list1));

        // Create a copy of data1
        MyData data2 = new MyData(Optional.of(data1.getData()));

        // Modify data1
        data1.addData(5);

        // Print data1 and data2 to show they are independent
        System.out.println("Data 1: "+data1.getData());
        System.out.println("Data 2: "+data2.getData());

        // Create MyData with an empty list
        MyData data3 = new MyData(Optional.empty());

        // Create MyData with null (will use the default empty list)
        MyData data4 = new MyData(Optional.ofNullable(null));

        System.out.println("Data 3: "+data3.getData());
        System.out.println("Data 4: "+data4.getData());

    }
}