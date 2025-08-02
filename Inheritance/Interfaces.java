interface Flyable{ // First interface
    void fly();
}

interface Swimmable{ // Second interface
    void swim();
}

class Bird implements Flyable, Swimmable{ // Class implementing multiple interfaces
    @Override
    public void fly(){
        System.out.println("Bird is flying");
    }

    @Override
    public void swim(){
        System.out.println("Bird is swimming");
    }
}

public class Interfaces { // Main class
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.swim();
    }
}