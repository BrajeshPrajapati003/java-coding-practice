public class PrintNameOfClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("java.util.Scanner");
        Class kls = Class.forName("java.io.File");
        Class klss = Class.forName("java.lang.Exception");

        System.out.println("The Associate name of the class: "+cls.getName());
        System.out.println("The Associate simple name of the class: "+ cls.getSimpleName());
        System.out.println();
        System.out.println("kls Associated name of the class: "+kls.getName());
        System.out.println("kls Associated simpel name of the class: "+kls.getSimpleName());
        System.out.println();
        System.out.println("kls Associated name of the class: "+klss.getName());
        System.out.println("kls Associated simpel name of the class: "+klss.getSimpleName());
    }
}
