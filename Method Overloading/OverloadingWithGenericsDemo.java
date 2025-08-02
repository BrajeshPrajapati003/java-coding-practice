class MethodOverloadingDemo{
    int add(int a, int b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }

    <T> T add(T a, T b){ // Generic method to add two values of any type
        return a;
    }
}

public class OverloadingWithGenericsDemo {
    public static void main(String[] args) {
        MethodOverloadingDemo calc = new MethodOverloadingDemo();

        int sumInt = calc.add(10, 20);
        String concatStr = calc.add("Hello", " World");
        Object result = calc.add(3.7, 43.66);

        System.out.println("Sum of Integers: " + sumInt);
        System.out.println("Concatenation of Strings: " + concatStr);
        System.out.println("Generic Result: " + result);
    }
}
