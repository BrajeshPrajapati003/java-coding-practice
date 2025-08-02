public class Main6 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.makeSound();
        dg.move();
    }
}

abstract class Animal{
    abstract void makeSound();
}

abstract class Mammal extends Animal{
    abstract void move();
}

class Dog extends Mammal{
    
    @Override
    void makeSound(){
        System.out.println("woof...woof....");
    }

    @Override
    void move(){
        System.out.println("Moves with 4 legs....");
    }
}