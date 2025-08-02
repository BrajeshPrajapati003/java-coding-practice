import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        System.out.println("List 1: " + list);
        Collections.sort(list);
    
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                Integer ob = list.get(i);
                list.remove(ob);
                i--;
            }
        }
        System.out.println(list);
    }
}
