public class Swap2Strings {
    public static void main(String[] args) {
        String str1 = "Brajesh Prajapati";
        String str2 = "CSE Student";
        String str;

        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);
        System.out.println("Swapping the strings...");

        str = str1;
        str1 = str2;
        str2 = str;

        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);      
    }
}
