public class Main2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,6);

        System.out.println("Circle Area: " + circle.calcArea());
        circle.disp();

        System.out.println("Rectangle Area: " + rectangle.calcArea());
        rectangle.disp();
    }
}

abstract class Shape{
    abstract double calcArea(); // Abstract method (no body)
    void disp(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    double radius;
    
    Circle(double radius){ // Constructor
        this.radius = radius;
    }
    @Override
    double calcArea(){ // Implementation of the abstract method
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calcArea(){ // Implementation of the abstract method
        return length * breadth;
    }
}