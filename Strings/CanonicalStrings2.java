public class CanonicalStrings2 {
    public static void main(String[] args) {
        String s1 = "Brajesh Prajapati";
        String s2 = new StringBuffer("Brajesh").append("Prajapati").toString();
        String s3 = s1.intern(); // doesn't create a new string but creates a reference to the previous string if the string doesn't already exist

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}
