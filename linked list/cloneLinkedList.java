import java.util.LinkedList;
public class cloneLinkedList {
  public static void main(String[] args) {
    LinkedList <String> list = new LinkedList<> ();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    System.out.println("Given list: " + list);

    // System.out.println("The linked list after being cloned:");
    // LinkedList <String> clonedList = new LinkedList<>(list);
    // System.out.println(clonedList);

    LinkedList<String> newList = new LinkedList<> ();
    newList = (LinkedList)list.clone();
    System.out.println(newList);
  }
}
