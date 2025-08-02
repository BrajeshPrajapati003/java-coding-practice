public class Printer {
    void print(String text){
        System.out.println("String: " + text);
    }

    void print(int num, String... messages){
        System.out.print("Integer: " + num + " , Messages: ");
        for(String message: messages){
            System.out.print(message + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello Brajesh...");
        printer.print(43, "Brajesh is", "Awesome");
    }
}
