import java.util.LinkedList;

public class compare2Lists {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String> ();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    System.out.println("Given list 1: " + list);

    LinkedList <String> list2 = new LinkedList<String> ();
    list2.add("a");
    list2.add("b");
    list2.add("e");
    list2.add("i");
    list2.add("l");
    list2.add("m");
    list2.add("f");
    System.out.println("Given list 2: " + list2);

    LinkedList <String> list3 = new LinkedList<> ();
    for(String e : list){
      list3.add(list2.contains(e) ? "yes" : "no");
    }
    System.out.println(list3);
  }
}
