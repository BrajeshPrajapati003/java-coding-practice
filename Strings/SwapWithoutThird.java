public class SwapWithoutThird {
    public static void main(String[] args) {
        String s1 = "Brajesh";
        String s2 = "Prajapati";
        System.out.println("String 1: "+s1);
        System.out.println("String 2: "+s2);
        System.out.println("Swapping both the Strings...");

        s1 = s1+s2; // Concatenate str1 and str2
        s2 = s1.substring(0, s1.length()-s2.length()); // Extract the original str1
        s1 = s1.substring(s2.length()); // Extract the original str2

        System.out.println("String 1: "+s1);
        System.out.println("String 2: : "+s2);
    }
}