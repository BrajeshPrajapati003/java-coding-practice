public class CheckAnonymous2 {
    public static void main(String[] args) {
        
        Class <? extends Object> cls = new Object() {}.getClass();
        boolean res = cls.isAnonymousClass();

        if(res) System.out.println("Anonymous class");
        else System.out.println("Not an Anonymous class");
    }
}
