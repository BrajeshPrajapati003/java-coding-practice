public class Main5 {
    public static void main(String[] args) {
        Circle crl = new Circle("Red");
        crl.draw();
        crl.disp();

    }
}

abstract class Shape{
    String color;
    Shape(String color){
        this.color = color;
    }
    abstract void draw();
    void disp(){
        System.out.println("Shape color is: " + color);
    }
}

class Circle extends Shape{
    Circle(String color){
        super(color);
    }
    @Override
    void draw(){
        System.out.println("Drawing circle....");
    }
}