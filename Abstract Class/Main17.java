
abstract class Shape{
    protected String color;
    Shape(String color){
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape{
    Circle(String color){
        super(color);
    }
    @Override
    void draw(){
        System.out.println("Drawing a circle of color: " + color);
    }
}

public class Main17 {
    public static void main(String[] args) {
        Circle crl = new Circle("Teal");
        crl.draw();
    }
}
