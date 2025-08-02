import java.util.*;

public class middleElementAtOnce {
  public static void main(String[] args) {
    // LinkedList <String> list = new LinkedList<>();
    // list.add("a");
    // list.add("b");
    // list.add("c");
    // list.add("d");
    // list.add("e");
    // list.add("f");
    // list.add("g");
    // list.add("h");
    // System.out.println("Given list: " + list);

    // System.out.println(list.get(list.size()/2));

//     LinkedList col_list = new LinkedList();
//     LinkedList.Node head = col_list.head();
//     col_list.add( new LinkedList.Node("Blue"));
//     col_list.add(new LinkedList.Node("Pink"));
//     col_list.add(new LinkedList.Node("Orange"));
//     col_list.add(new LinkedList.Node("Yellow"));
//     col_list.add(new LinkedList.Node("White"));

//     //finding middle element of the linked list in single pass

//     LinkedList.Node current = head;
//     int len = 0;
//     LinkedList.Node middle = head;

//     while(current.next() != null){
//       len++;
//       if(len%2 == 0) {
//         middle = middle.next();
//       }
//     current =  current.next();
//     }
//     if(len%2 == 1) {
//       middle = middle.next();
//     }
//     System.out.println("length of the linked list is " + len);
//     System.out.println("middle element is " + middle);
//   }
// }
// class LinkedList{
//   private Node head;
//   private Node tail;

//   public LinkedList(){
//     this.head = new Node("head");
//     tail = head;
//   }

//   public Node head(){
//     return head;
//   }
//   public void add(Node node){
//     tail.next = node;
//     tail = node;
//   }

//   public static class Node{
//     private Node next;
//     private String data;

//     public Node(String data){
//       this.data = data;
//     }

//     public String data(){
//       return data;
//     }

//     public void setData(String data){
//       this.data = data;
//     }

//     public Node next(){
//       return next;
//     }

//     public void setNext(Node next){
//       this.next = next;
//     }

//     public String toString(){
//       return this.data;
//     }

    LinkedList col_list = new LinkedList();
    LinkedList.Node head = col_list.head();
    col_list.add( new LinkedList.Node("Blue") );
    col_list.add( new LinkedList.Node("Pink") );
    col_list.add( new LinkedList.Node("Orange"));
    col_list.add( new LinkedList.Node("Yellow"));
    col_list.add( new LinkedList.Node("White"));

    //finding middle element of the LinkedList in single pass

    LinkedList.Node current = head;
    int len = 0;
    LinkedList.Node middle = head;

    while(current.next() != null){
      len++;
      if(len%2 == 0){
        middle = middle.next();
      }
      current = current.next();
    }
    if(len%2 == 1){
      middle = middle.next();
    }
    System.out.println("Length of LinkedList: "+ len);
    System.out.println("Middle element of LinkedList: "+ middle);
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