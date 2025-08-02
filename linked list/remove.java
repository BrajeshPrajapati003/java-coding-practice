import java.util.LinkedList;

public class remove {
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
    list.remove(3);
    System.out.println(list);
    list.remove("a");
    System.out.println(list);
  }
}
