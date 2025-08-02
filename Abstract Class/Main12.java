public class Main12 {
    public static void main(String[] args) {
        Circle crl = new Circle();
        crl.draw();
    }
}

abstract class Shape{
    static{
        System.out.println("Static block in abstract class...");
    }
    abstract void draw();
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle...");
    }
}