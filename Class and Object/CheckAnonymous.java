public class CheckAnonymous {
    public static void main(String[] args) {

        Class <?extends Object> cls = new Object() {}.getClass();
        boolean res = cls.isAnonymousClass();

        if(res) System.out.println("It's an Anonymous class");
        else System.out.println("It's not an Anonymous class");

    }
}