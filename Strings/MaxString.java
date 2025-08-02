public class MaxString {
    public static void main(String[] args) {
        String str1 = "brajesh ka roll number 66";
        String str2 = "brajesh ka roll number 66 hai ya nahi me bhool gaya hehe!";
        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
        System.out.println();
        System.out.println("Maximum String: " + maxString(str1, str2));
        if(maxString(str1, str2).equals("")) System.out.println("Both the given strings are equal.");
    }

    public static String maxString(String str1, String str2){
        String maxStr = str1.length() > str2.length() ? str1 : str2;
        if(str1.length() == str2.length()) return "";
        return maxStr;
    }
}
