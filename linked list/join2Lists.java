import java.util.LinkedList;
import java.util.Iterator;

public class join2Lists {
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
    
    LinkedList <String> list2 = new LinkedList<>();
    list2.add("p");
    list2.add("q");
    list2.add("r");
    list2.add("s");
    list2.add("t");
    list2.add("u");
    list2.add("v");
    System.out.println("Given list 2: " + list2);

    LinkedList<String> list3 = new LinkedList<> (list);
    list3.addAll(list2);
    list3.addAll(list);
    System.out.println(list3);
  }
}
