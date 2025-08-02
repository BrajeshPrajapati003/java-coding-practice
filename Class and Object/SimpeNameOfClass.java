public class SimpeNameOfClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class kalaas = Class.forName("SimpeNameOfClass!");
        System.out.println("The Name Assoticated with cls: "+kalaas.getName());
        System.out.println("Simple Class Name Associated with cls: "+kalaas.getSimpleName());

    }
}
