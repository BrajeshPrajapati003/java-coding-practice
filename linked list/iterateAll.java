    //? iterate all starting from a specified position

import java.util.LinkedList;
import java.util.Iterator;
public class iterateAll {
 public static void main(String[] args) {
  LinkedList <String> list = new LinkedList<>();
  list.add("hii");
  list.add("chammak");
  list.add("challo");
  list.add("mera");
  list.add("naam");
  list.add("hai");
  list.add("khalnaayak");
  System.out.println(list);

  Iterator it = list.listIterator(3);
  while(it.hasNext()){
    System.out.print(it.next() + " ");
  }
 } 
}
