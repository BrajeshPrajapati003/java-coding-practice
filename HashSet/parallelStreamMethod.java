import java.util.HashSet;
public class parallelStreamMethod {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hardik");
        set.add("brajesh");
        set.add("virat");
        set.add("rohit");
        set.add("bumrah");

        System.out.println("Hash Set Elements: ");
        set.parallelStream().forEach(System.out::println);
    }
}
