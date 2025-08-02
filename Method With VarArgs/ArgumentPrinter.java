public class ArgumentPrinter {
    static void printArgs(Object... args){
        for(Object arg: args){
            System.out.println("Type: " + arg.getClass().getSimpleName() + ", Value: " + arg);
        }
    }
    public static void main(String[] args) {
        printArgs(43, "Brajesh", 66.67, true);
    }
}
