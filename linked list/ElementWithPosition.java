import java.util.LinkedList;
public class ElementWithPosition {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList <>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    System.out.println("Given list: " + list);

    // int idx = 1;
    // for(String e: list){
    //   System.out.println(e + " is at position " + idx);
    //   idx++;
    // }

    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i) + " is at position " + (i+1));
    }
  }
}
