import java.util.HashSet;
public class removeAll{
   public static void main(String[] args) {
      HashSet<String> set = new HashSet<>();
      set.add("red");
      set.add("teal");
      set.add("blue");
      set.add("pink");
      System.out.println("Elements before removing the elements");
      System.out.println(set);
      System.out.println("Elements after removing the elements");
      set.clear();
      System.out.println(set);
   }
}