public class SuperMethod {

    /* 
     * Super keyword can't be used in static context
     */
    
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.makeSound();
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("The dog is barking");
    }
}