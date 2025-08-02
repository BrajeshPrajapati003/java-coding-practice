class MethodOverloadingDemo{
    void print(String message){
        System.out.println("Printing String: " + message);
    }

    void print(Number num){
        System.out.println("Printing Number: " + num);
    }
}
public class OverloadingWithSubclassesDemo {
    public static void main(String[] args) {
        MethodOverloadingDemo printer = new MethodOverloadingDemo();
        String str = "Hello World!";
        Integer integer = 43;
        Double dbl = 66.67;

        printer.print(str);
        printer.print(integer);
        printer.print(dbl); // Double is a subclass of Number
    }
}
