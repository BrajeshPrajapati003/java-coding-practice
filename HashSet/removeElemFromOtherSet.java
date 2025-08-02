import java.util.HashSet;
public class removeElemFromOtherSet {
    public static void main(String[] args) {
        HashSet <Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("set is: "+ set1);

        HashSet <Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        // set2.add(4);
        System.out.println("set is: "+ set2);

        HashSet <Integer> set3 = new HashSet<>();
        set3.add(9);
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(5);
        System.out.println("set is: "+ set3);

        if(set1.removeAll(set2)){
            System.out.println("Items removed from set 1 compared with set 2");
        }else{
            System.out.println("Items could not be removed from set 1 compared with set 2");
        }
        if(set1.removeAll(set3)){
            System.out.println("Items removed from set 1 compared with set 3");
        }else{
            System.out.println("Items couldn't be removed from set 1 compared with set 3");
        }
    }
}
