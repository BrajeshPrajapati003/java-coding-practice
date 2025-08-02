public class ImplementParametrizedConstructor {
    public static void main(String[] args) {
        Student s = new Student(66, 20, "Brajesh Prajapati"); // Parametrized constructor
        s.printInfo();
        
    }
}

class Student{
    int id;
    int age;
    String name;
    Student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}