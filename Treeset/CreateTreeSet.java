import java.util.TreeSet;

public class CreateTreeSet{
    public static void main(String[] args){
        TreeSet<String> col = new TreeSet<>();
        col.add("blue");
        col.add("red");
        col.add("green");
        col.add("white");
        col.add("pink");

        System.out.println("TreeSet Elements: " + col);
        System.out.println("Size of the TreeSet: " + col.size());

        System.out.println("Cloning the treeSet:");
        TreeSet<String> clone_col = (TreeSet<String>)col.clone();
        System.out.println("Cloned TreeSet Elements: " + clone_col);

        System.out.println("Removing a specified item from the treeset:");
        col.remove("red");
        col.remove("pink");
        System.out.println("Updated TreeSet: " + col);
    }
}