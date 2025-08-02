interface Greet{
    default void sayNamaste(){
        System.out.println("Namaste Uncle...");
    }
    void sayHello();
}

class Person implements Greet{
    @Override
    public void sayHello(){
        System.out.println("Hello uncle...");
    }
}

public class IntefaceWithDefaultMethod {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayNamaste();
        person.sayHello();
    }
}
