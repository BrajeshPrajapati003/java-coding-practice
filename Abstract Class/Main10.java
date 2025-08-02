public class Main10 {
    public static void main(String[] args) {
        Circle crl = new Circle();
        crl.display();
    }
}

abstract class Shape{
    abstract void draw();
    void display(){
        System.out.println("Displaying Shape!");
        draw();
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle!");
    }
}