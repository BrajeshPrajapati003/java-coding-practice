import java.lang.reflect.Method;
public class getMethodNames{
    public static void main(String[] args) throws ClassNotFoundException{
        Class cls = Class.forName("java.lang.Integer");
        Method methods[] = cls.getMethods();
        System.out.println(methods);
        for(Method m: methods){
            System.out.println(m);
        }
    }
}