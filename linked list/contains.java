import java.util.LinkedList;
public class contains {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("ji");
    list.add("haa");
    list.add("me");
    list.add("hu");
    list.add("kali");
    System.out.println("Given list: "+list);

    // for(int i=0; i<list.size(); i++){
    //   if(list.get(i) == "hu"){
    //     System.out.println("hu has been found at index " + i);
    //   }
    // }

    if(list.contains("hu")) System.out.println("hu has been found");
    else System.out.println("hu has not been found");
    if(list.contains("kalki")) System.out.println("kalki has been found");
    else System.out.println("kalki has not been found");
  }
}
