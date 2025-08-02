class Parent{ // Parent class
    void display() throws Exception{
        System.out.println("Parent's Display Method");
    }
}

class Child extends Parent{ // Child class
    @Override
    void display() throws RuntimeException{
        System.out.println("Child's Display Method");
    }
}

public class MethodOverride { // Main class
    public static void main(String[] args) {
        Parent parent = new Child();
        try{
            parent.display();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}