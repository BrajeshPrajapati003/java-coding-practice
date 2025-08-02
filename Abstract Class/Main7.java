public class Main7 {
    public static void main(String[] args) {
        Circle crl = new Circle();
        crl.draw();
        Shape.incrementCount();
        System.out.println("Total Shapes: " + Shape.count);
    }   
}

abstract class Shape{
    static int count = 0;
    abstract void draw();
    static void incrementCount(){
        count++;
    }
}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing Circle...");
    }
    
}