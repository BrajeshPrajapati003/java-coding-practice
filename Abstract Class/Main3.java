public class Main3 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        apple.displayTaste();
        orange.displayTaste();
    }
}

abstract class Fruit{
    abstract void displayTaste();
}

class Apple extends Fruit{
    @Override
    void displayTaste(){
        System.out.println("Apples are sweet...");
    }
}

class Orange extends Fruit{
    @Override
    void displayTaste(){
        System.out.println("Oranges are tangy...");
    }
}