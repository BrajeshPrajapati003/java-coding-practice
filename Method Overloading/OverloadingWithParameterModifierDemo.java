public class OverloadingWithParameterModifierDemo {
    public static void main(String[] args) {
        MethodOverloadingDemo printer = new MethodOverloadingDemo();
        String mes = "Brajesh Prajapati";
        int num = 67;
        printer.printInfo(mes); // Non-final parameter
        printer.printInfo(num); // Final parameter

        Calculator cal = new Calculator();
        
        System.out.println("Sum (static method): " + cal.add(43, 66, 67));
        System.out.println("Sum (non-static method): " + Calculator.add(43, 67));
    }
}

class MethodOverloadingDemo{
    void printInfo(String message){
        System.out.println("Printing Non-Final: " + message);
    }

    void printInfo(final int num){
        System.out.println("Printing Final: " + num);
    }
}

class Calculator{
    static int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}
