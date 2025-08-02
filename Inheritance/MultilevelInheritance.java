class Animal{ // Grandparent class

    protected String name;
    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " can eat");
    }
}

class Dog extends Animal{ // Parent class inheriting from Animal
    public Dog(String name){
        super(name);
    }

    public void bark(){
        System.out.println(name+" can bark loudly.");
    }
}

class Puppy extends Dog{ // Child class inheriting from Dog
    public Puppy(String name){
        super(name);
    }

    public void move(){
        System.out.println(name+" can't move very fast.");
    }

}
public class MultilevelInheritance {
    public static void main(String[] args) {
        
        Puppy p = new Puppy("Tommy");
        p.eat(); // Call method from Animal class
        p.move(); // Call method from Puppy class
        p.bark(); // Call method from Dog class
    }
}
