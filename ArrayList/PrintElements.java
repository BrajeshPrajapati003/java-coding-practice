import java.util.ArrayList;

public class PrintElements {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(66);
        list.add(67);
        list.add(71);

        System.out.println("Given arraylist: " + list);
        System.out.println("Print using index of an arraylist...");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
