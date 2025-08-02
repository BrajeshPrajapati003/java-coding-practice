import java.util.LinkedList;

public class replaceElement {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<> ();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    System.out.println("Given list: " + list);

    list.set(3, "m");
    System.out.println(list);
  }
}