public class ReplaceSubString {
    public static void main(String[] args) {
        String s = "Brajesh Prajapati Brajesh";
        System.out.println("Given string: "+ s);
        String str = new String(s.replace("Brajesh", "Yogesh"));
        System.out.println("After Replacement: " + str);
    }
}