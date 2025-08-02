public class SingleLevelInheritance {
    public static void main(String[] args) {

        // Create an instance of Dog
        Dog dog = new Dog("Buddy");

        // Call methods from Animal Class
        dog.eat();
        // Call methdods from Dog class
        dog.bark();
    }
}

// Parent Class (Superclass)
class Animal{

    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }
}

// Child Class (Subclass) inheriting from Animal
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void bark(){
        System.out.println(name + " is barking");
    }
}