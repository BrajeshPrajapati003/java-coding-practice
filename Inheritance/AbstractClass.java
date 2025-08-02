abstract class Shape{
    abstract double calculateArea();
}

class Circle extends Shape{
    double radius;
    Circle(double r){
        radius = r;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double length, width;
    Rectangle(double l, double w){
        length = l;
        width = w;
    }

    @Override
    double calculateArea(){
        return length * width;
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,  6);

        System.out.println("Area of circle: "+circle.calculateArea());
        System.out.println("Area of rectangle: "+rectangle.calculateArea());
    }
}