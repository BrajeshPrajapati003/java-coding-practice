public class Student extends Person{ // Child class

    public void showDetails(){
        display(); // Protected Method is accessible in the child class
        System.out.println("Student Class Method");
    }
    public static void main(String[] args) {
        Student cls = new Student();
        cls.showDetails();
    }
}

class Person{ // Parent class
    protected void display(){
        System.out.println("Person's Protected Method");
    }
}