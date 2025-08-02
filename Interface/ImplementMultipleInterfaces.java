interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Bird implements Flyable, Swimmable{
    @Override
    public void fly(){
        System.out.println("Birds can fly except Ostrich...");
    }
    @Override
    public void swim(){
        System.out.println("Birds can't swim except Dove....");
    }
}
public class ImplementMultipleInterfaces {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}
