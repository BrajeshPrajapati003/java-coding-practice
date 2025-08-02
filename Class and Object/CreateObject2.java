public class CreateObject2 {
    public static void main(String[] args){
        Student s = new Student(66, "Brajesh", 20);
        s.printStudentDetails();
    }
}

class Person{
    int age;
    String name;
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}
class Student{
    int sId;
    int sName;
    Person p;
    Student(int id, String name, int age){
        p = new Person(20, "Brajesh");
        sId = id;
    }

    public void printStudentDetails(){
        System.out.println("Student ID: "+sId);
        System.out.println("Student Name: "+p.name);
        System.out.println("Student Age: "+p.age);
    }
}