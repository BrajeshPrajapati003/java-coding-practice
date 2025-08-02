public class CheckStartWith {
    public static void main(String[] args) {
        String s1 = "Mausambi, My name is Brajesh Prajapati";
        String s2 = "Brajesh Prajapati, it's my name....";
        // String s3 = "Mausambi";
        String s3 = "name....";

        System.out.println("First string starts with "+s3+"? "+s1.startsWith(s3));
        System.out.println("Second string starts with "+s3+"? "+s2.startsWith(s3));

        System.out.println("Second string starts with "+s3+"? "+s2.endsWith(s3));

        // System.out.println(s1+" - starts with "+ s3+" ?: "+ s1.startsWith(s3));
        // System.out.println(s2+" - starts with "+ s3+" ?: "+ s2.startsWith(s3));
    }
}
