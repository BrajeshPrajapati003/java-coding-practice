import java.util.ArrayList;
public class CloneArrayList{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Brajesh");
        list1.add("Kunal");
        list1.add("Zombie");
        ArrayList<String> list2 = (ArrayList<String>)list1.clone();

        System.out.println("Cloned array list: " + list2);
        list2.add("Kirti");
        System.out.println(list2); // Cloned list gets changed
        System.out.println(list1); // Original remains unchanged
    }
}