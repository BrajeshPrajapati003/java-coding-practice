public class ClassLoader2 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class c1 = Class.forName("ClassLoader");
        Class c2 = Class.forName("java.lang.String");
        Class c3 = int.class;

        System.out.println("Class loader with c1: "+c1.getClassLoader());
        System.out.println("Class loader with c2: "+c2.getClassLoader());
        System.out.println("Class loader with c3: "+c3.getClassLoader());
    }
}
