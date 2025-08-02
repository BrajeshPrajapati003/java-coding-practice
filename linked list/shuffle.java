import java.util.LinkedList;
import java.util.Collections;

public class shuffle {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<> ();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("t");
    list.add("k");
    System.out.println("Given list: " + list);
    Collections.shuffle(list);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
}
