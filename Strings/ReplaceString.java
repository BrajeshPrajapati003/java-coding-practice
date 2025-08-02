public class ReplaceString {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati";
        String str2 = "String function";
        // System.out.println(str.replace("brajesh", "prajapati"));

        System.out.println("Strings before replacing: ");
        System.out.println(str);
        System.out.println(str2);

        str2 = str2.replace(str2, str);
        System.out.println("Strings after replacing: ");
        System.out.println(str);
        System.out.println(str2);

    }
}