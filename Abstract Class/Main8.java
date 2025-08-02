public class Main8 {
    public static void main(String[] args) {
        SubCircle crl = new SubCircle();
        crl.display();
        crl.draw();
    }
}

class Shape{
    void display(){
        System.out.println("shape display");
    }
}

abstract class Circle extends Shape{
    abstract void draw();
}

class SubCircle extends Circle{
    @Override
    void draw(){
        System.out.println("Drawing Circle...");
    }
}