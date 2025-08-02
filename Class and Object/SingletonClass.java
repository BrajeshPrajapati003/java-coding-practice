public class SingletonClass {
    public static void main(String[] args) {
        Singleton o1 = Singleton.singltn();
        Singleton o2 = Singleton.singltn();
        Singleton o3 = Singleton.singltn();

        if( o1 == o2 && o1 == o3){
            System.out.println("All objects are pointing to the same memory location");
        }else{
            System.out.println("All objects are not poiting to the same memory location");
        }
    }
}

class Singleton{
    private static Singleton singleRef = null;

    private Singleton(){}

    public static Singleton singltn(){
        if(singleRef == null){
            singleRef = new Singleton();
        }
        return singleRef;
    }
}