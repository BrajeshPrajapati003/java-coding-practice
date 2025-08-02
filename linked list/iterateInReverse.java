import java.util.LinkedList;
import java.util.Iterator;

public class iterateInReverse {
  public static void main(String[] args) {
    LinkedList <String> list = new LinkedList<>();
    list.add("hi");
    list.add("hello");
    list.add("world");
    list.add("in");
    list.add("java");
    list.add("with");
    list.add("linked");
    list.add("list");

    System.out.println("linked list: " + list);

    Iterator it = list.descendingIterator();
    System.out.println("Reverse list: " + it);
    while(it.hasNext()){
      System.out.print(" " + it.next());
    }

  }
}
