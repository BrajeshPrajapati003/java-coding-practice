public class EqualsCompareToOperator {
    public static void main(String[] args) {
        String str1 = "Brajesh Prajapati";
        String str2 = "Khalnaayak";
        
        System.out.println("Comparing Strings using equals()...");
        System.out.println("String 1 & 2 : " + str1.equals(str2));
        System.out.println("String 1 & 1 : " + str1.equals(str1));
        System.out.println();

        System.out.println("Comparing Strings using == operator...");
        System.out.println("String 1 & 2 : " + (str1 == str2));
        System.out.println("String 1 & 1 : " + (str1 == str1));
        System.out.println();

        System.out.println("Comparing strings using compareTo()...");
        System.out.println("String 1 & 2 : " + str1.compareTo(str2));
        System.out.println("String 1 & 1 : " + str1.compareTo(str1));
        
    }
}
