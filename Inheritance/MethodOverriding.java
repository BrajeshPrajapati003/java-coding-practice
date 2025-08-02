class Shape{
    void calculateArea(){
        System.out.println("Area calculation not implemented");
    }
}

class Circle extends Shape{
    @Override
    void calculateArea(){
        System.out.println("Area of circle: 2 * "+Math.PI+" * radius");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Circle cl = new Circle();
        cl.calculateArea();
    }
}