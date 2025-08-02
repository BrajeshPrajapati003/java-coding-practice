public class ReplaceAllPattern {
    public static void main(String[] args) {
        String s = "123-45-7890";
        String s2 = s.replaceAll("\\d", "*");
        System.out.println(s2);
    }
}
