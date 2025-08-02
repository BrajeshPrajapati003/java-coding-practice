public class CreateObject {
    public static void main(String[] args) {
        Student emp = new Student(101, "Brajesh", 32);
        emp.printStudentDetails();
    }
}

class Person{
    String name;
    int age;

    Person(int age, String name){
        this.name = name;
        this.age = age;
    }
}

class Student{
    int stu_id;
    int stu_per;
    Person p;

    Student(int id, String name, int age){
        p = new Person(age, name);
        stu_id = id;
    }

    void printStudentDetails(){
        System.out.println("Student ID: "+stu_id);
        System.out.println("Student Name: "+p.name);
        System.out.println("Student Age: "+p.age);
    }
}