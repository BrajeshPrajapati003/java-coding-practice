import java.util.function.Function;

@FunctionalInterface
interface CustomFunction<T, R>{
    R apply(T t);
}

public class CustomFunctionExample{
 public static void main(String[] args) {
    Function<Integer, String> toString = Object::toString;
    CustomFunction<Integer, String> customToString = Object::toString;

    String res1 = toString.apply(43);
    String res2 = customToString.apply(66);

    System.out.println("Result using Function: " + res1);
    System.out.println("Result using Custom Function: " + res2);
 }   
}
