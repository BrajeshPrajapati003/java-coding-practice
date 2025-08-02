class Student{
    private final String name;
    private final int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class MethodOverloadingDemo{
    void printStudInfo(Student stud){
        System.out.println("Student Info:");
        System.out.println("Name: " + stud.getName());
        System.out.println("Age: " + stud.getAge());
    }

    void printStudInfo(String name){
        System.out.println("Student Name: " + name);
    }
}

public class OverloadingWithCustomObjects {
    public static void main(String[] args) {
        MethodOverloadingDemo printer = new MethodOverloadingDemo();
        Student stud = new Student("Leo", 43);

        printer.printStudInfo(stud);
        printer.printStudInfo("Brajesh");
    }
}
