class Animal{ // Parent class
    String makeSound(){
        return "Animal makes a sound";
    }
}

class Dog extends Animal{ // Child class
    @Override
    String makeSound(){
        return "Dog barks"; // Covariant return type
    }
}

public class ReturnTypes { // Main class
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.makeSound());
    }
}