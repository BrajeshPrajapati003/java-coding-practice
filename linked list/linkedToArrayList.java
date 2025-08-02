import java.util.LinkedList;
import java.util.ArrayList;

public class linkedToArrayList {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    System.out.println("Given list: " + list);

    ArrayList <String> arrList = new ArrayList<>(list);
    for(String s: arrList){
      System.out.print(s+" ");
    }
  }
}
