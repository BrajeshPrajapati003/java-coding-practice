import java.util.LinkedList;

public class removeFirstLast {
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
    list.removeFirst();
    System.out.println(list);
    list.removeLast();
    System.out.println(list);
  }
}
