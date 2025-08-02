public class ObjectOfAnotherClass {
    public static void main(String[] args) {
        ObjectClass ob = new ObjectClass();
        ob.display();
    }
}

class ObjectClass{
    public void display(){
        System.out.println("This is a method of ObjectClass");
    }
}