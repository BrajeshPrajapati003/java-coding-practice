public class GetPackageName{
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            Class c1 = Class.forName("java.util.Set");
            Class c2 = Class.forName("java.lang.String");
            Class c3 = Class.forName("java.util.Scanner");
            System.out.println("package Names...");
            System.out.println(c1.getPackage());
            System.out.println(c2.getPackage());
            System.out.println(c3.getPackage());
        }catch(ClassCastException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}