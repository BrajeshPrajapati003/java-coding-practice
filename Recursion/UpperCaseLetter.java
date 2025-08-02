public class UpperCaseLetter {
    public static void main(String[] args) {
        String str = "Brajesh prajapati";
        char res = firstUpperCaseLetter(str, 0);
        if(res == 0) System.out.println("No uppercase letter in the string!");
        else System.out.println(res);
    }

    public static char firstUpperCaseLetter(String str, int i){
        if(str.charAt(i) == '\0') return 0;
        if(Character.isUpperCase(str.charAt(i))) return str.charAt(i);
        try {
            return firstUpperCaseLetter(str, i+1);
        } catch (Exception e) {
            System.out.println("Exception occurs..."+ e.getMessage());
        }
        return 0;
    }
}
