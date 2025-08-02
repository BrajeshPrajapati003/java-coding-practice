public class CompareWithStringBuffer {
    public static void main(String[] args) {
        String s1 = "Brajesh Prajapati";
        String s2 = "Yogesh Prajapati";
        StringBuffer buffer = new StringBuffer(s1);

        System.out.println("Comparing '"+ s1 +"' and '"+ buffer+"': "+s1.contentEquals(buffer));
        System.out.println("Comparing '"+ s2 +"' and '"+ buffer+"': "+s2.contentEquals(buffer));
    }
}