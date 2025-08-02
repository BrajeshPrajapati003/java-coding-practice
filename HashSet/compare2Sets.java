import java.util.HashSet;
public class compare2Sets {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("brajesh");
        set1.add("divyansh");
        set1.add("ankit");
        set1.add("bobby");
        System.out.println("first set: " + set1);

        HashSet<String> set2 = new HashSet<>();
        set2.add("brajesh");
        set2.add("ankit");
        set2.add("gajendra");
        System.out.println("second set: " + set2);

        for(String s: set1){
            if(set2.contains(s)){
                System.out.println("common "+s);
            }else System.out.println("isn't common " + s);
        }

    }
}
