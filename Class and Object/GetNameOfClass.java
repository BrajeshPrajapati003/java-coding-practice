public class GetNameOfClass {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class cls = Class.forName("GetNameOfClass");
        Class cls = Class.forName("java.lang.String");
        System.out.println("Class Name Associated with cls: "+ cls.getName());
        System.out.println("Simple Name Associated with cls: "+cls.getSimpleName());
    }
}
