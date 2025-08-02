public class CountCodePoint {
    public static void main(String[] args) {
        String str = "Tutor Joes";
        System.out.println("Given String: "+ str);
        int c = str.codePointCount(1,10);
        System.out.println("Code Point count: "+ c);
    }
}
