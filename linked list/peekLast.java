import java.util.LinkedList;
import java.util.Iterator;

public class peekLast {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("dhuaan");
    list.add("dhuan");
    list.add("macha");
    list.add("denge");
    System.out.print(list);

    // String last = list.peekLast();
    // System.out.println(last);
    // Iterator it = list.iterator();
    // while(it.hasNext()){
    //   System.out.print(it.next()+" ");
    // }

    int lastElement = list.size()-1;
    String last = list.get(lastElement);
    System.out.println(last);
    System.out.println(list);

  }
}
