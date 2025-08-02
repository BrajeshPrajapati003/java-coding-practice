import java.util.TreeSet;

public class ItemExist {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(30);
        num.add(40);
        num.add(10);
        num.add(20);
        num.add(60);

        if(num.contains(30)){
            System.out.println("Item exists");
        }else{
            System.out.println("Item doesn't exist");
        }
    }
}
