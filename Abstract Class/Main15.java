public class Main15 {
    public static void main(String[] args) {
        Circle crl = new Circle(5);
        Square sqr = new Square(4);

        System.out.println("Are of the circle: " + crl.calcArea());
        System.out.println("Area of the square: " + sqr.calcArea());
    }
}

abstract class Shape{
    static final double PI = 3.14159;
    abstract double calcArea();
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calcArea(){
        return PI * radius * radius;
    }
}

class Square extends Shape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    double calcArea(){
        return side * side;
    }
}