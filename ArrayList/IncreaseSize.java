import java.util.ArrayList;
public class IncreaseSize {
    public static void main(String[] args) {
        // Use ArrayList directly
        ArrayList<String> list = new ArrayList<>();
        list.add("C++");
        list.add("java");
        list.add("HTML");
        System.out.println("Original Array: " + list);
        // Corrected: ensureCapacity() is an ArrayList method
        list.ensureCapacity(6);
        list.add("C");
        list.add("PHP");
        list.add("MySQL");
        System.out.println("New increased arraylist: " + list);
    }
}
