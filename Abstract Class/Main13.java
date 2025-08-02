abstract class Shape{
    abstract void draw();
    final void display(){
        System.out.println("Displaying shape...");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing circle....");
    }
}

public class Main13 {
    public static void main(String[] args) {
        Circle crl = new Circle();
        crl.draw();
        crl.display();
    }
}
