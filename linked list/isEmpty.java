import java.util.LinkedList;

public class isEmpty {
  public static void main(String[] args) {
    LinkedList <String> list = new LinkedList <> ();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    System.out.println("Given list: " + list);

    // Iterator it = list.iterator();
    // if(it.hasNext()) System.out.println("not empty");
    // else System.out.println("list is empty");

    System.out.println("list is empty or not? "+ list.isEmpty());
    list.removeAll(list);
    System.out.println("list is empty or not? "+ list.isEmpty());

  }
}
