// Base class
class Animal {
    // Method to be overridden in subclasses
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog extending Animal
class Dog extends Animal {
    @Override
    void sound() {
        // Dog's implementation of the sound method
        System.out.println("Dog barks");
    }
}

// Derived class Cat extending Animal
class Cat extends Animal {
    @Override
    void sound() {
        // Cat's implementation of the sound method
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate dynamic method dispatch
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Array of Animal references
        Animal[] animal = new Animal[3];
        
        // Assigning Dog, Cat, and Animal objects to the array
        animal[0] = new Dog(); // Dog object
        animal[1] = new Cat(); // Cat object
        animal[2] = new Animal(); // Animal object

        // For-each loop to call sound() method on each Animal reference
        for (Animal ani : animal) {
            ani.sound(); // Dynamic method dispatch
        }
    }
}