import java.util.LinkedList;
import java.util.Collections;
public class swap2Elements {
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

    // String temp = list.get(2);
    // list.set(2, list.get(1));
    // list.set(1, temp);
    // System.out.println("Final list: "+ list);

    Collections.swap(list, 1, 2);
    System.out.println(list);
  }
}
