public class CanonicalString {
    public static void main(String[] args) {
        String s1 = "Brajesh Prajapati";
        String s2 = new StringBuffer("Brajesh ").append("Prajapati").toString();
        String s3 = s2.intern();

        System.out.println(s1 +" == " + s2 +" :" +(s1 == s2));
        System.out.println(s1 +" == "+s3 +" :" + (s1 == s3));

    }
}