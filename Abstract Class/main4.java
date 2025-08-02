public class main4 {
    public static void main(String[] args) {
        Shape.disp();
        Circle circle = new Circle();
        circle.draw();
    }
}

abstract class Shape{
    public static void disp(){
        System.out.println("This is a shape....");
    }

    abstract void draw();
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle....");
    }
}