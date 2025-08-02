//   public static void main(String[] args) {
//     LinkedList <String> list = new LinkedList<>();
//     list.add("hello");
//     list.add("papita");
//     list.add("in");
//     list.add("this");
//     list.add("beautiful");
//     list.add("world");

//     System.out.println(list);

//     Iterator it = list.descendingIterator();
//     System.out.println("reverse list ");
//     while(it.hasNext()){
//       System.out.println(it.next());
//     }

//   }
// }

// public class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<String>();
//     list.add("ji");
//     list.add("world");
//     list.add("khalnaayak");

//     System.out.println(list);

//     Iterator it = list.descendingIterator();
//     System.out.println("reverse list ");
//     while(it.hasNext()){
//       System.out.print(it.next()+ " ");
//     }
//   }
// }

// public class onLoop{
//   public static void main(String[] args) {
//     LinkedList <String> list = new LinkedList<>();
//     list.add("hello");
//     list.add("world");
//     list.add("my");
//     list.add("name");
//     list.add("is");
//     list.add("theOfficialTyrant");
//     System.out.println(list);

//     Iterator it = list.listIterator(2);
//     while(it.hasNext()){
//       System.out.println(it.next());
//     }
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList <String> ll = new LinkedList <> ();
//     ll.add("a");
//     ll.add("b");
//     ll.add("c");
//     ll.add("d");
//     ll.add("e");
//     ll.add("f");
//     ll.add("g");
//     System.out.println(ll);
//     String last = ll.peekLast();
//     System.out.println(last);
//     System.out.println(ll);
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList <String> list = new LinkedList <> ();
//     list.add("ji");
//     list.add("haa");
//     list.add("me");
//     list.add("hu");
//     list.add("kali");
//     System.out.println("Given list: "+list);

//     if(list.contains("ji")) System.out.println("ji found");
//     else System.out.println("ji not found");
//   }
// }

// class onLoop {
//   public static void main(String[] args) {
//     LinkedList <String> list = new LinkedList<> ();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);

//     ArrayList <String> list2 = new ArrayList<> (list);
//     System.out.print("ArrayList: ");
//     for(String s: list2){
//       System.out.print(s+ " ");
//     }
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList <String> list = new LinkedList <>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list 1: " + list);

//     LinkedList <String> list2 = new LinkedList<String> ();
//     list2.add("k");
//     list2.add("l");
//     list2.add("e");
//     list2.add("a");
//     list2.add("b");
//     list2.add("g");
//     list2.add("c");
//     System.out.println("Given list 2: " + list2);

//     LinkedList <String> list3 = new LinkedList <> ();
//     for(String e: list2){
//       list3.add(list.contains(e)?"yeah":"nope");
//     }
//     System.out.println(list3);
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<> ();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);
//     Iterator it = list.iterator();
//     if(it.hasNext()) System.out.println("list is not empty");
//     else System.out.println("list is empty");
//     list.removeAll(list);
//     System.out.println(list.isEmpty());
//   }
// }

// public class onLoop {
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<> ();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);
//     System.out.println(list.peekFirst());
//     System.out.println(list);
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<String>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);
//     System.out.println(list.pop());
//     System.out.println(list);
//   }
// }

// public class onLoop {
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList <> ();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);

//     LinkedList<String> list2 = new LinkedList<> (list);
//     System.out.println("Cloned list using constructor: " + list2);

//     LinkedList<String> clonedList = new LinkedList<>();
//     clonedList = (LinkedList) list.clone();
//     System.out.println("Cloned list using clone(): "+ clonedList);
//   }  
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list 1: " + list);
//     LinkedList<String> list2 = new LinkedList<>();
//     list2.add("d");
//     list2.add("l");
//     list2.add("e");
//     list2.add("k");
//     list2.add("o");
//     list2.add("p");
//     list2.add("q");
//     System.out.println("Given list 2: " + list2);
//     LinkedList<String> list3 = new LinkedList<> ();
//     list3.addAll(list);
//     // System.out.println(list3);
//     list3.addAll(list2);
//     System.out.println("New Linked List: "+ list3);
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);
//     int idx = 1;

//     for(String s : list){
//       System.out.println(s + " at " + idx);
//       idx++;
//     }

//     for(int i = 0; i < list.size();i++){
//       System.out.println("Element "+ list.get(i)+ " at index "+ (i+1));
//     }
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);
//     list.remove("a");
//     System.out.println(list);
//     list.remove(2);
//     System.out.println(list);
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);
//     list.removeAll(list);
//     System.out.println("Final list: " + list);
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);

//     String temp = list.get(2);
//     list.set(2,list.get(5));
//     list.set(5, temp);
//     System.out.println(list);

//     Collections.swap(list,2,5);
//     System.out.println(list);
//   }
// }

// class onLoop{
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     list.add("d");
//     list.add("e");
//     list.add("f");
//     list.add("g");
//     System.out.println("Given list: " + list);
//     Collections.shuffle(list);
//     System.out.println(list);
//   }
// }

class onLoop{
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    LinkedList.Node head = list.head();
    list.add( new LinkedList.Node("Blue") );
    list.add( new LinkedList.Node("Pink") );
    list.add( new LinkedList.Node("Orange") );
    list.add( new LinkedList.Node("Yellow") );
    list.add( new LinkedList.Node("White") );
    list.add( new LinkedList.Node("Magenta") );

    //finding middle element of the linked list in single pass

    LinkedList.Node current = head;
    int len = 0;
    LinkedList.Node middle = head;
    while(current.next() != null){
      len++;
      if (len%2 != 0){
        middle = middle.next();
      }
      current = current.next();
    }
    if(len%2 == 1){
      middle = middle.next();
    }
    System.out.println(len);
    System.out.println("middle element: "+middle);
  }
}

class LinkedList{
  private Node head;
  private Node tail;

  public LinkedList(){
    this.head = new Node("head");
    tail = head;
  }
  public Node head(){
    return head;
  }
  public void add(Node node){
    tail.next = node;
    tail = node;
  }
  public static class Node{
    private Node next;
    private String data;
    public Node(String data){
      this.data = data;
    }
    public String data(){
      return data;
    }
    public void setData(String data){
      this.data = data;
    }
    public Node next(){
      return next;
    }
    public void setNext(Node next){
      this.next = next;
    }
    public String toString(){
      return this.data;
    }
  }
}