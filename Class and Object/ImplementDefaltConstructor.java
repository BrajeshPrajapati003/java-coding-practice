public class ImplementDefaltConstructor {
    public static void main(String[] args) {
        Student s = new Student(); // Default constructor
        s.printValues();
    }
}

class Student{
    int id;
    int age;
    String name;

    Student(){
        id = 66;
        age = 20;
        name = "Brajesh Prajapati";
    }
    
    void printValues(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("id: "+id);
    }
}