class Person{
    String name;
    int age;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}

class Student extends Person{
    int id;
    float per;

    Student(int idNum, String name, int age, float percent){
        super(age, name);
        id = idNum;
        per = percent;
    }

    void printStudentDetails(){
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Percent: "+per);
    }
}

public class StudentInheritsPerson {
    public static void main(String[] args) {
        Student s = new Student(43, "Brajesh Prajapati", 20, 72.4f);
        s.printStudentDetails();
    }
}