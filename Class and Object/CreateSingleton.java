public class CreateSingleton {
    public static void main(String[] args) {
        SingClass s1 = SingClass.getInstance();
        SingClass s2 = SingClass.getInstance();
        if(s1 == s2){
            System.out.println("Objects pointing to the same location");
        }else{
            System.out.println("Objects pointing to different locations");
        }
    }
}

class SingClass{
    private static SingClass instance;

    private SingClass(){
        // Private constructor to prevent direct instantiation
    }

    public static SingClass getInstance(){
        if(instance == null){
            instance = new SingClass();
        }
        return instance;
    }

    // ......Other methods.....
}