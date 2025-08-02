import java.util.HashSet;
public class useRemoveIfMethod {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("brajesh");
        set.add("prajapati");
        set.add("shivam");
        set.add("tiwari");
        set.add("rishabh");
        set.add("dixit");
        set.add("ankit");

        System.out.println("HashSet Elements: "+ set);

        if(set.removeIf(val -> (val == "brajesh" || val == "prajapati"))){
            System.out.println("My name removed successfully");
        }else{
            System.out.println("Unable to remove my name");
        }

        System.out.println("the remaining set is: " + set);
    }
}
